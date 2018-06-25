select * from Filme.Pais;
insert into Filme.Ator values ("batatoso", '20/05/1998',"BRA"); # precisa ser YYYY/MM/DD
update Filme.Ator set  DataNascimento='2000/01/21', Pais_Sigla= "fsf" where NomeAtor ="Batata batatao";
select * from Filme.Ator;

SELECT P.id as ID, P.nome as Nome, equipe_id, E.nome, P.pais_sigla as 'Sigla do Pais', P.status as Status  
FROM PILOTO as P, EQUIPE as E 
WHERE E.id = P.equipe_id;

SELECT A.NomeAtor as Nome, A.DataNascimento as 'Nascido em ', A.Pais_Sigla as 'Sigla do Pais' 
FROM Filme.Ator as A , Filme.Pais as P
WHERE A.Pais_Sigla = P.Sigla;
