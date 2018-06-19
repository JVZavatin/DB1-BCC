-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema Filme
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Filme
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Filme` DEFAULT CHARACTER SET utf8 ;
USE `Filme` ;

-- -----------------------------------------------------
-- Table `Filme`.`Pais`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Filme`.`Pais` (
  `Sigla` VARCHAR(45) NOT NULL,
  `Nome` VARCHAR(100) NULL,
  PRIMARY KEY (`Sigla`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Filme`.`Produtora`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Filme`.`Produtora` (
  `idNomeProdutora` VARCHAR(100) NOT NULL,
  `Pais_Sigla` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idNomeProdutora`),
  INDEX `fk_Produtora_Pais1_idx` (`Pais_Sigla` ASC),
  CONSTRAINT `fk_Produtora_Pais1`
    FOREIGN KEY (`Pais_Sigla`)
    REFERENCES `Filme`.`Pais` (`Sigla`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Filme`.`Diretor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Filme`.`Diretor` (
  `NomeDiretor` VARCHAR(100) NOT NULL,
  `Pais_Sigla` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`NomeDiretor`),
  INDEX `fk_Diretor_Pais1_idx` (`Pais_Sigla` ASC),
  CONSTRAINT `fk_Diretor_Pais1`
    FOREIGN KEY (`Pais_Sigla`)
    REFERENCES `Filme`.`Pais` (`Sigla`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Filme`.`Filme`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Filme`.`Filme` (
  `Nome` VARCHAR(200) NOT NULL,
  `Produtora_idNomeProdutora` VARCHAR(100) NOT NULL,
  `Diretor_NomeDiretor` VARCHAR(100) NOT NULL,
  `Ano` INT NULL,
  PRIMARY KEY (`Nome`),
  INDEX `fk_Filme_Produtora1_idx` (`Produtora_idNomeProdutora` ASC),
  INDEX `fk_Filme_Diretor1_idx` (`Diretor_NomeDiretor` ASC));


-- -----------------------------------------------------
-- Table `Filme`.`Ator`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Filme`.`Ator` (
  `NomeAtor` VARCHAR(100) NOT NULL,
  `DataNascimento` DATE NULL,
  `Pais_Sigla` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`NomeAtor`),
  INDEX `fk_Ator_Pais1_idx` (`Pais_Sigla` ASC),
  CONSTRAINT `fk_Ator_Pais1`
    FOREIGN KEY (`Pais_Sigla`)
    REFERENCES `Filme`.`Pais` (`Sigla`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Filme`.`Genero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Filme`.`Genero` (
  `idGenero` VARCHAR(20) NOT NULL,
  `Descricao` VARCHAR(100) NULL,
  PRIMARY KEY (`idGenero`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Filme`.`Premios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Filme`.`Premios` (
  `idNomePremio` VARCHAR(60) NOT NULL,
  `Descricao` VARCHAR(45) NULL,
  PRIMARY KEY (`idNomePremio`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Filme`.`Premios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Filme`.`Premios` (
  `idNomePremio` VARCHAR(60) NOT NULL,
  `Descricao` VARCHAR(45) NULL,
  PRIMARY KEY (`idNomePremio`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Filme`.`Filme_has_Ator`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Filme`.`Filme_has_Ator` (
  `Filme_Nome` VARCHAR(200) NOT NULL,
  `Ator_NomeAtor` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`Filme_Nome`, `Ator_NomeAtor`),
  INDEX `fk_Filme_has_Ator_Ator1_idx` (`Ator_NomeAtor` ASC),
  INDEX `fk_Filme_has_Ator_Filme1_idx` (`Filme_Nome` ASC));


-- -----------------------------------------------------
-- Table `Filme`.`Filme_has_Genero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Filme`.`Filme_has_Genero` (
  `Filme_Nome` VARCHAR(200) NOT NULL,
  `Genero_idGenero` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`Filme_Nome`, `Genero_idGenero`),
  INDEX `fk_Filme_has_Genero_Genero1_idx` (`Genero_idGenero` ASC),
  INDEX `fk_Filme_has_Genero_Filme1_idx` (`Filme_Nome` ASC));


-- -----------------------------------------------------
-- Table `Filme`.`Filme_has_Premios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Filme`.`Filme_has_Premios` (
  `Filme_Nome` VARCHAR(200) NOT NULL,
  `Premios_idNomePremio` VARCHAR(60) NOT NULL,
  `Ano` INT NULL,
  PRIMARY KEY (`Filme_Nome`, `Premios_idNomePremio`),
  INDEX `fk_Filme_has_Premios_Premios1_idx` (`Premios_idNomePremio` ASC),
  INDEX `fk_Filme_has_Premios_Filme1_idx` (`Filme_Nome` ASC));


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO Filme.Genero VALUES ( "Acao" , "Filmes bblblabla");
select * from Filme.Genero order by Filme.Genero.idGenero ;
