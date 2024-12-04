alter table medicos add column activo tinyint;
update medicos set activo = 1;
alter table medicos modify activo tinyint not null;