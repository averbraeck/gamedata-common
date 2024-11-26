-- MySQL Script generated by MySQL Workbench
-- Tue Nov 26 08:57:47 2024
-- Model: Gamedata    Version: 20241110
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema gamedata
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `gamedata` ;

-- -----------------------------------------------------
-- Schema gamedata
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `gamedata` DEFAULT CHARACTER SET utf8 ;
USE `gamedata` ;

-- -----------------------------------------------------
-- Table `gamedata`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`user` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(255) NULL,
  `password` VARCHAR(255) NOT NULL,
  `salt` VARCHAR(45) NOT NULL,
  `super_admin` TINYINT NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`game`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`game` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(20) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `description` TEXT NOT NULL,
  `token_forced` TINYINT NOT NULL DEFAULT 0,
  `logo` TEXT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`game_role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`game_role` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `game_admin` TINYINT NOT NULL,
  `game_viewer` TINYINT NOT NULL,
  `user_id` INT UNSIGNED NOT NULL,
  `game_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_userrole_user_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_userrole_game1_idx` (`game_id` ASC) VISIBLE,
  CONSTRAINT `fk_userrole_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `gamedata`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_userrole_game1`
    FOREIGN KEY (`game_id`)
    REFERENCES `gamedata`.`game` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`game_version`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`game_version` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `game_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_game_version_game1_idx` (`game_id` ASC) VISIBLE,
  CONSTRAINT `fk_game_version_game1`
    FOREIGN KEY (`game_id`)
    REFERENCES `gamedata`.`game` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`organization`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`organization` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(16) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `logo` TEXT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`game_access`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`game_access` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `token_forced` TINYINT NOT NULL DEFAULT 0,
  `anonymous_sessions` TINYINT NOT NULL DEFAULT 0,
  `game_id` INT UNSIGNED NOT NULL,
  `organization_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_token_game1_idx` (`game_id` ASC) VISIBLE,
  INDEX `fk_token_organization1_idx` (`organization_id` ASC) VISIBLE,
  CONSTRAINT `fk_token_game1`
    FOREIGN KEY (`game_id`)
    REFERENCES `gamedata`.`game` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_token_organization1`
    FOREIGN KEY (`organization_id`)
    REFERENCES `gamedata`.`organization` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`game_session`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`game_session` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(16) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `session_token` VARCHAR(45) NOT NULL,
  `session_status` VARCHAR(45) NOT NULL,
  `play_date` DATE NULL,
  `valid` TINYINT NOT NULL DEFAULT 1,
  `valid_from` DATETIME NULL,
  `valid_until` DATETIME NULL,
  `token_for_dashboard` TINYINT NOT NULL,
  `game_version_id` INT UNSIGNED NOT NULL,
  `game_access_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_game_session_game_version1_idx` (`game_version_id` ASC) VISIBLE,
  UNIQUE INDEX `session_token_UNIQUE` (`session_token` ASC) VISIBLE,
  INDEX `fk_game_session_game_access1_idx` (`game_access_id` ASC) VISIBLE,
  CONSTRAINT `fk_game_session_game_version1`
    FOREIGN KEY (`game_version_id`)
    REFERENCES `gamedata`.`game_version` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_game_session_game_access1`
    FOREIGN KEY (`game_access_id`)
    REFERENCES `gamedata`.`game_access` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`game_mission`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`game_mission` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `game_version_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_game_mission_game_version1_idx` (`game_version_id` ASC) VISIBLE,
  CONSTRAINT `fk_game_mission_game_version1`
    FOREIGN KEY (`game_version_id`)
    REFERENCES `gamedata`.`game_version` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`group`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`group` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `game_session_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_group_game_session1_idx` (`game_session_id` ASC) VISIBLE,
  CONSTRAINT `fk_group_game_session1`
    FOREIGN KEY (`game_session_id`)
    REFERENCES `gamedata`.`game_session` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`group_role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`group_role` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `group_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_group_role_group1_idx` (`group_id` ASC) VISIBLE,
  CONSTRAINT `fk_group_role_group1`
    FOREIGN KEY (`group_id`)
    REFERENCES `gamedata`.`group` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`player`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`player` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `display_name` VARCHAR(45) NOT NULL,
  `game_session_id` INT UNSIGNED NOT NULL,
  `group_role_id` INT UNSIGNED NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_player_game_session1_idx` (`game_session_id` ASC) VISIBLE,
  INDEX `fk_player_group_role1_idx` (`group_role_id` ASC) VISIBLE,
  CONSTRAINT `fk_player_game_session1`
    FOREIGN KEY (`game_session_id`)
    REFERENCES `gamedata`.`game_session` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_player_group_role1`
    FOREIGN KEY (`group_role_id`)
    REFERENCES `gamedata`.`group_role` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`scale`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`scale` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NOT NULL,
  `min_value` FLOAT NULL DEFAULT 0.0,
  `max_value` FLOAT NULL DEFAULT 100.0,
  `value_list` VARCHAR(512) NULL,
  `value_scores` VARCHAR(512) NULL,
  `game_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `type_UNIQUE` (`type` ASC) VISIBLE,
  INDEX `fk_scale_game1_idx` (`game_id` ASC) VISIBLE,
  CONSTRAINT `fk_scale_game1`
    FOREIGN KEY (`game_id`)
    REFERENCES `gamedata`.`game` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`learning_goal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`learning_goal` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` TEXT NOT NULL,
  `game_mission_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_learning_goal_game_mission1_idx` (`game_mission_id` ASC) VISIBLE,
  CONSTRAINT `fk_learning_goal_game_mission1`
    FOREIGN KEY (`game_mission_id`)
    REFERENCES `gamedata`.`game_mission` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`group_objective`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`group_objective` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `threshold` VARCHAR(45) NOT NULL,
  `scale_id` INT UNSIGNED NOT NULL,
  `learning_goal_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_group_objective_scale1_idx` (`scale_id` ASC) VISIBLE,
  INDEX `fk_group_objective_learning_goal1_idx` (`learning_goal_id` ASC) VISIBLE,
  CONSTRAINT `fk_group_objective_scale1`
    FOREIGN KEY (`scale_id`)
    REFERENCES `gamedata`.`scale` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_group_objective_learning_goal1`
    FOREIGN KEY (`learning_goal_id`)
    REFERENCES `gamedata`.`learning_goal` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`group_attempt`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`group_attempt` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `attempt_nr` INT NOT NULL,
  `status` VARCHAR(45) NOT NULL,
  `group_id` INT UNSIGNED NOT NULL,
  `game_mission_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_group_attempt_group1_idx` (`group_id` ASC) VISIBLE,
  INDEX `fk_group_attempt_game_mission1_idx` (`game_mission_id` ASC) VISIBLE,
  CONSTRAINT `fk_group_attempt_group1`
    FOREIGN KEY (`group_id`)
    REFERENCES `gamedata`.`group` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_group_attempt_game_mission1`
    FOREIGN KEY (`game_mission_id`)
    REFERENCES `gamedata`.`game_mission` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`group_score`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`group_score` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `score_type` VARCHAR(45) NOT NULL,
  `delta` FLOAT NULL,
  `new_score_number` FLOAT NULL,
  `new_score_string` VARCHAR(16) NULL,
  `timestamp` TIMESTAMP NOT NULL DEFAULT current_timestamp(),
  `final_score` TINYINT NOT NULL DEFAULT 0,
  `status` VARCHAR(45) NULL,
  `round` VARCHAR(16) NULL,
  `game_time` VARCHAR(45) NULL,
  `grouping_code` VARCHAR(45) NULL,
  `group_objective_id` INT UNSIGNED NULL,
  `group_attempt_id` INT UNSIGNED NOT NULL,
  `scale_id` INT UNSIGNED NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_group_score_group_objective1_idx` (`group_objective_id` ASC) VISIBLE,
  INDEX `fk_group_score_group_attempt1_idx` (`group_attempt_id` ASC) VISIBLE,
  INDEX `fk_group_score_scale1_idx` (`scale_id` ASC) VISIBLE,
  CONSTRAINT `fk_group_score_group_objective1`
    FOREIGN KEY (`group_objective_id`)
    REFERENCES `gamedata`.`group_objective` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_group_score_group_attempt1`
    FOREIGN KEY (`group_attempt_id`)
    REFERENCES `gamedata`.`group_attempt` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_group_score_scale1`
    FOREIGN KEY (`scale_id`)
    REFERENCES `gamedata`.`scale` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`player_attempt`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`player_attempt` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `attempt_nr` INT NOT NULL DEFAULT 1,
  `status` VARCHAR(45) NOT NULL DEFAULT 'UNKNOWN',
  `player_id` INT UNSIGNED NOT NULL,
  `game_mission_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_player_attempt_player1_idx` (`player_id` ASC) VISIBLE,
  INDEX `fk_player_attempt_game_mission1_idx` (`game_mission_id` ASC) VISIBLE,
  CONSTRAINT `fk_player_attempt_player1`
    FOREIGN KEY (`player_id`)
    REFERENCES `gamedata`.`player` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_player_attempt_game_mission1`
    FOREIGN KEY (`game_mission_id`)
    REFERENCES `gamedata`.`game_mission` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`player_objective`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`player_objective` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `threshold` VARCHAR(45) NOT NULL,
  `scale_id` INT UNSIGNED NOT NULL,
  `learning_goal_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_player_objective_scale1_idx` (`scale_id` ASC) VISIBLE,
  INDEX `fk_player_objective_learning_goal1_idx` (`learning_goal_id` ASC) VISIBLE,
  CONSTRAINT `fk_player_objective_scale1`
    FOREIGN KEY (`scale_id`)
    REFERENCES `gamedata`.`scale` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_player_objective_learning_goal1`
    FOREIGN KEY (`learning_goal_id`)
    REFERENCES `gamedata`.`learning_goal` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`player_score`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`player_score` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `score_type` VARCHAR(45) NOT NULL,
  `delta` FLOAT NULL,
  `new_score_number` FLOAT NULL,
  `new_score_string` VARCHAR(16) NULL,
  `timestamp` TIMESTAMP NOT NULL DEFAULT current_timestamp(),
  `mission_attempt` INT NULL,
  `final_score` TINYINT NOT NULL DEFAULT 0,
  `status` VARCHAR(45) NULL,
  `round` VARCHAR(16) NULL,
  `game_time` VARCHAR(45) NULL,
  `grouping_code` VARCHAR(45) NULL,
  `player_attempt_id` INT UNSIGNED NOT NULL,
  `player_objective_id` INT UNSIGNED NULL,
  `scale_id` INT UNSIGNED NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_player_score_player_attempt1_idx` (`player_attempt_id` ASC) VISIBLE,
  INDEX `fk_player_score_player_objective1_idx` (`player_objective_id` ASC) VISIBLE,
  INDEX `fk_player_score_scale1_idx` (`scale_id` ASC) VISIBLE,
  CONSTRAINT `fk_player_score_player_attempt1`
    FOREIGN KEY (`player_attempt_id`)
    REFERENCES `gamedata`.`player_attempt` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_player_score_player_objective1`
    FOREIGN KEY (`player_objective_id`)
    REFERENCES `gamedata`.`player_objective` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_player_score_scale1`
    FOREIGN KEY (`scale_id`)
    REFERENCES `gamedata`.`scale` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`mission_event`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`mission_event` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NOT NULL DEFAULT 'DEFAULT',
  `key` VARCHAR(45) NOT NULL,
  `value` TEXT NOT NULL,
  `timestamp` TIMESTAMP NOT NULL DEFAULT current_timestamp(),
  `status` VARCHAR(45) NULL,
  `round` VARCHAR(16) NULL,
  `game_time` VARCHAR(45) NULL,
  `grouping_code` VARCHAR(45) NULL,
  `facilitator_initiated` TINYINT NOT NULL DEFAULT 0,
  `game_session_id` INT UNSIGNED NOT NULL,
  `game_mission_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_mission_event_game_session1_idx` (`game_session_id` ASC) VISIBLE,
  INDEX `fk_mission_event_game_mission1_idx` (`game_mission_id` ASC) VISIBLE,
  CONSTRAINT `fk_mission_event_game_session1`
    FOREIGN KEY (`game_session_id`)
    REFERENCES `gamedata`.`game_session` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_mission_event_game_mission1`
    FOREIGN KEY (`game_mission_id`)
    REFERENCES `gamedata`.`game_mission` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`player_event`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`player_event` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NOT NULL DEFAULT 'DEFAULT',
  `key` VARCHAR(45) NOT NULL,
  `value` TEXT NOT NULL,
  `timestamp` TIMESTAMP NOT NULL DEFAULT current_timestamp(),
  `mission_attempt` INT NULL,
  `status` VARCHAR(45) NULL,
  `round` VARCHAR(16) NULL,
  `game_time` VARCHAR(45) NULL,
  `grouping_code` VARCHAR(45) NULL,
  `player_initiated` TINYINT NOT NULL DEFAULT 0,
  `player_attempt_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_player_logdata_player_attempt1_idx` (`player_attempt_id` ASC) VISIBLE,
  CONSTRAINT `fk_player_logdata_player_attempt1`
    FOREIGN KEY (`player_attempt_id`)
    REFERENCES `gamedata`.`player_attempt` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`group_event`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`group_event` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NOT NULL DEFAULT 'DEFAULT',
  `key` VARCHAR(45) NOT NULL,
  `value` TEXT NOT NULL,
  `timestamp` TIMESTAMP NOT NULL DEFAULT current_timestamp(),
  `mission_attempt` INT NULL,
  `status` VARCHAR(45) NULL,
  `round` VARCHAR(16) NULL,
  `game_time` VARCHAR(45) NULL,
  `grouping_code` VARCHAR(45) NULL,
  `group_initiated` TINYINT NOT NULL DEFAULT 1,
  `group_attempt_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_group_event_group_attempt1_idx` (`group_attempt_id` ASC) VISIBLE,
  CONSTRAINT `fk_group_event_group_attempt1`
    FOREIGN KEY (`group_attempt_id`)
    REFERENCES `gamedata`.`group_attempt` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`private_dashboard`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`private_dashboard` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `key` VARCHAR(45) NOT NULL,
  `value` TEXT NOT NULL,
  `game_mission_id` INT UNSIGNED NOT NULL,
  `game_access_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_dashboard_setting_game_mission1_idx` (`game_mission_id` ASC) VISIBLE,
  INDEX `fk_dashboard_setting_game_access1_idx` (`game_access_id` ASC) VISIBLE,
  CONSTRAINT `fk_dashboard_setting_game_mission1`
    FOREIGN KEY (`game_mission_id`)
    REFERENCES `gamedata`.`game_mission` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_dashboard_setting_game_access1`
    FOREIGN KEY (`game_access_id`)
    REFERENCES `gamedata`.`game_access` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`access_token`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`access_token` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `value` VARCHAR(255) NOT NULL,
  `writer` TINYINT NOT NULL DEFAULT 1,
  `reader` TINYINT NOT NULL DEFAULT 1,
  `game_access_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_game_token_game_access1_idx` (`game_access_id` ASC) VISIBLE,
  UNIQUE INDEX `value_UNIQUE` (`value` ASC) VISIBLE,
  CONSTRAINT `fk_game_token_game_access1`
    FOREIGN KEY (`game_access_id`)
    REFERENCES `gamedata`.`game_access` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`public_dashboard`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`public_dashboard` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `key` VARCHAR(45) NOT NULL,
  `value` TEXT NOT NULL,
  `game_mission_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_game_dashboard_game_mission1_idx` (`game_mission_id` ASC) VISIBLE,
  CONSTRAINT `fk_game_dashboard_game_mission1`
    FOREIGN KEY (`game_mission_id`)
    REFERENCES `gamedata`.`game_mission` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`game_token`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`game_token` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `value` VARCHAR(255) NOT NULL,
  `writer` TINYINT NOT NULL,
  `reader` TINYINT NOT NULL,
  `game_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_game_token_game1_idx` (`game_id` ASC) VISIBLE,
  CONSTRAINT `fk_game_token_game1`
    FOREIGN KEY (`game_id`)
    REFERENCES `gamedata`.`game` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `gamedata`.`organization_role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamedata`.`organization_role` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `organization_admin` TINYINT NOT NULL DEFAULT 0,
  `session_admin` TINYINT NOT NULL DEFAULT 0,
  `session_viewer` TINYINT NOT NULL DEFAULT 0,
  `user_id` INT UNSIGNED NOT NULL,
  `organization_id` INT UNSIGNED NOT NULL,
  `session_game_access_id` INT UNSIGNED NULL,
  `session_game_session_id` INT UNSIGNED NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_organization_role_user1_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_organization_role_organization1_idx` (`organization_id` ASC) VISIBLE,
  INDEX `fk_organization_role_game_access1_idx` (`session_game_access_id` ASC) VISIBLE,
  INDEX `fk_organization_role_game_session1_idx` (`session_game_session_id` ASC) VISIBLE,
  CONSTRAINT `fk_organization_role_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `gamedata`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_organization_role_organization1`
    FOREIGN KEY (`organization_id`)
    REFERENCES `gamedata`.`organization` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_organization_role_game_access1`
    FOREIGN KEY (`session_game_access_id`)
    REFERENCES `gamedata`.`game_access` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_organization_role_game_session1`
    FOREIGN KEY (`session_game_session_id`)
    REFERENCES `gamedata`.`game_session` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
