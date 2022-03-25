create database PRJ301_DE150238

CREATE TABLE [dbo].[de150238](
	[CourseID] [varchar] (255)NOT NULL,
	[subject] [varchar](255) NULL,
	[leName] [varchar](255) NULL,
	[date] date
	PRIMARY KEY ([CourseID])
)

SET IDENTITY_INSERT [dbo].[de150238] ON 
INSERT INTO de150238 VALUES('C001','Destop Java Application',N'Nguyen Phong Son','12/09/20')
INSERT INTO de150238 VALUES('C002','Web programming',N'Doan Duy Binh','10/09/20')

drop table de150238

select * from DE150238

INSERT INTO De150238 VALUES(?,?,?,?)

UPDATE de150238
SET subject = ?, [leName] = ?,date =? 
WHERE CourseID =?;

select * from DE150238
where CourseID = C001