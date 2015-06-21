DROP TABLE IF EXISTS tbl_user;

DROP TABLE IF EXISTS sys_organization;
DROP TABLE IF EXISTS sys_resource;
DROP TABLE IF EXISTS sys_role;


CREATE TABLE tbl_user (
  id              BIGINT AUTO_INCREMENT,
  organization_id BIGINT,
  username        VARCHAR(100),
  PASSWORD        VARCHAR(100),
  salt            VARCHAR(100),
  role_ids        VARCHAR(100),
  locked          BOOL   DEFAULT FALSE,
  CONSTRAINT pk_user PRIMARY KEY (id)
);

CREATE UNIQUE INDEX idx_user_username ON tbl_user (username);

CREATE INDEX idx_user_organization_id ON tbl_user (organization_id);



