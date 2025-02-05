USE [master]
GO
/****** Object:  Database [test1]    Script Date: 5/21/2016 5:11:17 PM ******/
CREATE DATABASE [test1]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'test1', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\test1.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'test1_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\test1_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [test1] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [test1].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [test1] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [test1] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [test1] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [test1] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [test1] SET ARITHABORT OFF 
GO
ALTER DATABASE [test1] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [test1] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [test1] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [test1] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [test1] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [test1] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [test1] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [test1] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [test1] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [test1] SET  DISABLE_BROKER 
GO
ALTER DATABASE [test1] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [test1] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [test1] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [test1] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [test1] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [test1] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [test1] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [test1] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [test1] SET  MULTI_USER 
GO
ALTER DATABASE [test1] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [test1] SET DB_CHAINING OFF 
GO
ALTER DATABASE [test1] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [test1] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [test1] SET DELAYED_DURABILITY = DISABLED 
GO
USE [test1]
GO
/****** Object:  Table [dbo].[Infomation]    Script Date: 5/21/2016 5:11:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Infomation](
	[PLantID] [int] NOT NULL,
	[PH] [int] NULL,
	[Light] [int] NULL,
	[Humidity] [int] NULL,
	[Temperature] [int] NULL,
	[TemperatureOfSoil] [int] NULL,
 CONSTRAINT [PK_Infomation] PRIMARY KEY CLUSTERED 
(
	[PLantID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Plant]    Script Date: 5/21/2016 5:11:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Plant](
	[PlantID] [int] NOT NULL,
	[NamePlant] [varchar](50) NOT NULL,
	[Plants] [nchar](10) NOT NULL,
 CONSTRAINT [PK_Plant] PRIMARY KEY CLUSTERED 
(
	[PlantID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Transfer]    Script Date: 5/21/2016 5:11:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Transfer](
	[PlantID] [int] NOT NULL,
	[IDSersor] [int] NOT NULL,
	[SPH] [int] NOT NULL,
	[SLight] [int] NOT NULL,
	[SHumidity] [int] NOT NULL,
	[STemperature] [int] NOT NULL,
	[StemperatureOfSoil] [int] NOT NULL,
	[Pump] [bit] NOT NULL,
	[Covered] [bit] NOT NULL,
	[Misting] [bit] NOT NULL,
	[Duty] [bit] NOT NULL,
	[StartDay] [date] NOT NULL,
 CONSTRAINT [PK_Sensor_1] PRIMARY KEY CLUSTERED 
(
	[PlantID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[User]    Script Date: 5/21/2016 5:11:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[User](
	[UserID] [varchar](20) NOT NULL,
	[Password] [varchar](30) NOT NULL,
	[FullName] [nvarchar](50) NOT NULL,
	[Role] [bit] NOT NULL,
	[Location] [nvarchar](200) NOT NULL,
	[PhoneNumber] [varchar](11) NOT NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[UserID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[Infomation]  WITH CHECK ADD  CONSTRAINT [FK_Infomation_Plant] FOREIGN KEY([PLantID])
REFERENCES [dbo].[Plant] ([PlantID])
GO
ALTER TABLE [dbo].[Infomation] CHECK CONSTRAINT [FK_Infomation_Plant]
GO
ALTER TABLE [dbo].[Transfer]  WITH CHECK ADD  CONSTRAINT [FK_Sensor_Plant] FOREIGN KEY([PlantID])
REFERENCES [dbo].[Plant] ([PlantID])
GO
ALTER TABLE [dbo].[Transfer] CHECK CONSTRAINT [FK_Sensor_Plant]
GO
USE [master]
GO
ALTER DATABASE [test1] SET  READ_WRITE 
GO
