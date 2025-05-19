-- -----------------------------------------------------
-- Table `store`.`profiles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store`.`profiles` (
  `id` BIGINT NOT NULL,
  `bio` TEXT NULL,
  `phone_number` VARCHAR(15) NULL,
  `date_of_birth` DATE NULL,
  `loyalty_points` INT UNSIGNED NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  CONSTRAINT `profiles_id`
    FOREIGN KEY (`id`)
    REFERENCES `store`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
