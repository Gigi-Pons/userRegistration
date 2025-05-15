CREATE TABLE IF NOT EXISTS `store`.`addresses` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `street` VARCHAR(255) NOT NULL,
  `city` VARCHAR(255) NOT NULL,
  `zip` VARCHAR(255) NOT NULL,
  `user_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `addresses_fk_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `addresses_fk`
    FOREIGN KEY (`user_id`)
    REFERENCES `store`.`users` (`id`));

CREATE TABLE IF NOT EXISTS `store`.`users` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `password` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`));