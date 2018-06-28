SELECT * FROM Filme.Ator;
select * from Filme.Filme_has_Genero;

insert into Filme.Produtora (idNomeProdutora,Pais_Sigla) values ("produtora","HUE");

insert into Filme.Diretor (NomeDiretor, Pais_Sigla, DataNascimento ) values ("diretor","HUE",'2005/02/02');

insert into Filme.Filme (Nome,Produtora_idNomeProdutora,Diretor_NomeDiretor,Ano ) values (
"Teste","produtora","diretor",2000);

insert into Filme.Filme_has_Genero (Filme_Nome,Genero_idGenero) values ("Teste","feijao");

select * from Filme.Filme_has_Genero;	

SELECT A.Nome as 'Nome', A.Produtora_idNomeProdutora as 'Produtora', A.Diretor_NomeDiretor as 'Nome Diretor', A.Ano as 'ano' FROM Filme.Filme; 


insert into Filme.Produtora (idNomeProdutora, Pais_Sigla) values ("bei","fsf");
select * from Filme.Pais;
select * from Filme.Produtora;



`Nome` VARCHAR(200) NOT NULL,
  `Produtora_idNomeProdutora` VARCHAR(100) NOT NULL,
  `Diretor_NomeDiretor` VARCHAR(100) NOT NULL,
  `Ano` INT NULL,