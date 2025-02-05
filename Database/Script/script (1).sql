USE [garden]
GO
/****** Object:  Table [dbo].[account]    Script Date: 5/28/2016 12:38:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[account](
	[userID] [int] NOT NULL,
	[username] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
	[address] [nvarchar](50) NOT NULL,
	[phonenumber] [int] NOT NULL,
	[email] [varchar](50) NOT NULL,
 CONSTRAINT [PK_account] PRIMARY KEY CLUSTERED 
(
	[userID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[index]    Script Date: 5/28/2016 12:38:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[index](
	[plantid] [int] NOT NULL,
	[IDSersor] [int] NOT NULL,
	[SPH] [int] NULL,
	[SLight] [int] NULL,
	[SHumidity] [int] NULL,
	[STemperature] [int] NULL,
	[StemperatureOfSoil] [int] NULL,
	[time] [datetime] NULL,
 CONSTRAINT [PK_index] PRIMARY KEY CLUSTERED 
(
	[IDSersor] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[information]    Script Date: 5/28/2016 12:38:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[information](
	[imformationid] [int] NOT NULL,
	[plantid] [int] NOT NULL,
	[ph] [int] NULL,
	[light] [int] NULL,
	[humidity] [int] NULL,
	[temperature] [int] NULL,
	[temperatureofsoil] [int] NULL,
	[datefertilizer] [int] NULL,
	[daygrowth] [int] NULL,
 CONSTRAINT [PK_information] PRIMARY KEY CLUSTERED 
(
	[imformationid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[plant]    Script Date: 5/28/2016 12:38:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[plant](
	[plantid] [int] NOT NULL,
	[plantname] [nvarchar](50) NOT NULL,
	[varieties] [nvarchar](50) NULL,
 CONSTRAINT [PK_plant] PRIMARY KEY CLUSTERED 
(
	[plantid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[plantofuser]    Script Date: 5/28/2016 12:38:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[plantofuser](
	[userID] [int] NOT NULL,
	[uplantID] [int] NOT NULL,
	[uplantname] [nvarchar](50) NOT NULL,
	[uph] [int] NOT NULL,
	[ulight] [int] NOT NULL,
	[uhumidity] [int] NOT NULL,
	[utemperature] [int] NOT NULL,
	[utemperatureofsoil] [int] NOT NULL,
 CONSTRAINT [PK_plantofuser] PRIMARY KEY CLUSTERED 
(
	[uplantID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[transfer]    Script Date: 5/28/2016 12:38:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[transfer](
	[transferid] [int] NOT NULL,
	[plantid] [int] NULL,
	[startpump] [datetime] NULL,
	[durationpump] [int] NULL,
	[startcovered] [datetime] NULL,
	[durationstartcovered] [int] NULL,
	[startmisting] [datetime] NULL,
	[durationmisting] [int] NULL,
	[startduty] [datetime] NULL,
	[starday] [datetime] NULL,
	[durations] [int] NULL,
 CONSTRAINT [PK_transfer] PRIMARY KEY CLUSTERED 
(
	[transferid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
ALTER TABLE [dbo].[index]  WITH CHECK ADD  CONSTRAINT [FK_index_plant] FOREIGN KEY([plantid])
REFERENCES [dbo].[plant] ([plantid])
GO
ALTER TABLE [dbo].[index] CHECK CONSTRAINT [FK_index_plant]
GO
ALTER TABLE [dbo].[information]  WITH CHECK ADD  CONSTRAINT [FK_information_plant] FOREIGN KEY([plantid])
REFERENCES [dbo].[plant] ([plantid])
GO
ALTER TABLE [dbo].[information] CHECK CONSTRAINT [FK_information_plant]
GO
ALTER TABLE [dbo].[plantofuser]  WITH CHECK ADD  CONSTRAINT [FK_plantofuser_account] FOREIGN KEY([userID])
REFERENCES [dbo].[account] ([userID])
GO
ALTER TABLE [dbo].[plantofuser] CHECK CONSTRAINT [FK_plantofuser_account]
GO
ALTER TABLE [dbo].[transfer]  WITH CHECK ADD  CONSTRAINT [FK_transfer_plant] FOREIGN KEY([plantid])
REFERENCES [dbo].[plant] ([plantid])
GO
ALTER TABLE [dbo].[transfer] CHECK CONSTRAINT [FK_transfer_plant]
GO
