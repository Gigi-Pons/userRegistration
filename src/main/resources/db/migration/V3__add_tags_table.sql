-- -----------------------------------------------------
-- Table `store`.`tags`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store`.`tags` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE user_tags (
  user_id BIGINT NOT NULL,
  tag_id INT NOT NULL,
  PRIMARY KEY (user_id, tag_id),
  FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
  FOREIGN KEY (tag_id) REFERENCES tags(id) ON DELETE CASCADE
);
