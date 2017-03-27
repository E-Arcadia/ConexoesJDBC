Base = carros

<!-- HSQLDB -->
CREATE TABLE automoveis (
    id integer identity,
    placa varchar(40),
    ano varchar(10));
    
    
<!-- SQL SERVER -->
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