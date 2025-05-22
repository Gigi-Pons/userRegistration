-- -----------------------------------------------------
-- Table `store`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store`.`categories` (
  `id` TINYINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL,
  PRIMARY KEY (`id`));

  -- -----------------------------------------------------
  -- Table `store`.`products`
  -- -----------------------------------------------------
  CREATE TABLE IF NOT EXISTS `store`.`products` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NULL,
    `price` DECIMAL(10,2) NULL,
    `category_id` TINYINT NULL,
    PRIMARY KEY (`id`),
    INDEX `fk_category_idx` (`category_id` ASC) VISIBLE,
    CONSTRAINT `fk_category`
      FOREIGN KEY (`category_id`)
      REFERENCES `store`.`categories` (`id`)
      ON DELETE RESTRICT
      ON UPDATE NO ACTION);