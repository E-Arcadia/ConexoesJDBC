Base = carros

<!-- HSQLDB -->
CREATE TABLE automoveis (
    id integer identity,
    placa varchar(40),
    ano varchar(10));
    
    
<!-- SQL SERVER -->
<!-- -Djava.library.path="C:\Program Files\Microsoft JDBC Driver 4.0 for SQL Server\sqljdbc_4.0\enu\auth\x64" -->
<!-- https://msdn.microsoft.com/library/mt484311.aspx -->
<!-- https://docs.microsoft.com/en-us/sql/connect/jdbc/building-the-connection-url -->
USE [carros]
CREATE TABLE [dbo].[automoveis](
	[id] [int] NOT NULL,
	[placa] [varchar](40) NULL,
	[ano] [varchar](10) NULL,
 CONSTRAINT [PK_automoveis] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
    
    
<!-- MySQL -->
CREATE TABLE `carros`.`automoveis` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `placa` VARCHAR(40) NULL,
  `ano` VARCHAR(10) NULL,
  PRIMARY KEY (`id`));