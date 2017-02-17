--****************************************************
--
--权限表
--创建人: linj
--创建日期: 2016-06-01
--目标版本: 1.0
--****************************************************
 
 CREATE TABLE plms_permission
   (  ID              NUMBER(19)  NOT NULL,
      PERMISSION_NAME VARCHAR2(32),  
      PERMISSION_SIGN VARCHAR2(128),  
      DESCRIPTION     VARCHAR2(256),  
      IS_ACTIVE       CHAR(1)  NOT NULL,
      CREATED_BY      VARCHAR2(50)  NOT NULL,
      CREATE_TIME     TIMESTAMP(6)  NOT NULL,
      UPDATED_BY      VARCHAR2(50)  NOT NULL,
      UPDATE_TIME     TIMESTAMP(6)  NOT NULL,
      REC_VER         NUMBER(19)  NOT NULL,
      TAG_SEQ			    NUMBER(19)	NOT NULL,
      CONSTRAINT plms_permission_PK PRIMARY KEY (ID)
      ENABLE
   );
   
   COMMENT ON TABLE plms_permission IS '权限表'; 
   COMMENT ON COLUMN plms_permission.id IS '权限id'; 
   COMMENT ON COLUMN plms_permission.PERMISSION_NAME IS '权限名'; 
   COMMENT ON COLUMN plms_permission.PERMISSION_SIGN IS '权限标识,程序中判断使用,如"user:create"'; 
   COMMENT ON COLUMN plms_permission.DESCRIPTION IS '权限描述,UI界面显示使用'; 
   COMMENT ON COLUMN plms_permission.IS_ACTIVE IS '状态';
   COMMENT ON COLUMN plms_permission.CREATED_BY IS '新增人';
   COMMENT ON COLUMN plms_permission.CREATE_TIME IS '新增日期';
   COMMENT ON COLUMN plms_permission.UPDATED_BY IS '修改人';
   COMMENT ON COLUMN plms_permission.UPDATE_TIME IS '修改日期';
   COMMENT ON COLUMN plms_permission.REC_VER IS 'Version';
   COMMENT ON COLUMN plms_permission.TAG_SEQ IS 'Tag';
   
   CREATE SEQUENCE seq_plms_permission MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER NOCYCLE;
   
--****************************************************
--
--角色表
--创建人: linj
--创建日期: 2016-06-01
--目标版本: 1.0
--****************************************************
   CREATE TABLE plms_role
   (  ID              NUMBER(19)  NOT NULL,
      ROLE_NAME VARCHAR2(32),  
      ROLE_SIGN VARCHAR2(128),  
      DESCRIPTION     VARCHAR2(256),  
      IS_ACTIVE       CHAR(1)  NOT NULL,
      CREATED_BY      VARCHAR2(50)  NOT NULL,
      CREATE_TIME     TIMESTAMP(6)  NOT NULL,
      UPDATED_BY      VARCHAR2(50)  NOT NULL,
      UPDATE_TIME     TIMESTAMP(6)  NOT NULL,
      REC_VER         NUMBER(19)  NOT NULL,
      TAG_SEQ			    NUMBER(19)	NOT NULL,
      CONSTRAINT plms_role_PK PRIMARY KEY (ID)
      ENABLE
   );
   
   COMMENT ON TABLE plms_role IS '角色表'; 
   COMMENT ON COLUMN plms_role.id IS '角色id'; 
   COMMENT ON COLUMN plms_role.ROLE_NAME IS '角色名'; 
   COMMENT ON COLUMN plms_role.ROLE_SIGN IS '角色标识,程序中判断使用,如"admin"'; 
   COMMENT ON COLUMN plms_role.DESCRIPTION IS '角色描述,UI界面显示使用'; 
   COMMENT ON COLUMN plms_role.IS_ACTIVE IS '状态';
   COMMENT ON COLUMN plms_role.CREATED_BY IS '新增人';
   COMMENT ON COLUMN plms_role.CREATE_TIME IS '新增日期';
   COMMENT ON COLUMN plms_role.UPDATED_BY IS '修改人';
   COMMENT ON COLUMN plms_role.UPDATE_TIME IS '修改日期';
   COMMENT ON COLUMN plms_role.REC_VER IS 'Version';
   COMMENT ON COLUMN plms_role.TAG_SEQ IS 'Tag';
   
   CREATE SEQUENCE seq_plms_role MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER NOCYCLE;
   
--****************************************************
--
--角色权限表
--创建人: linj
--创建日期: 2016-06-01
--目标版本: 1.0
--****************************************************  
   CREATE TABLE plms_role_permission
   (  ID              NUMBER(19)  NOT NULL,
      ROLE_ID         NUMBER(19),  
      PERMISSION_ID   NUMBER(19),  
      IS_ACTIVE       CHAR(1)  NOT NULL,
      CREATED_BY      VARCHAR2(50)  NOT NULL,
      CREATE_TIME     TIMESTAMP(6)  NOT NULL,
      UPDATED_BY      VARCHAR2(50)  NOT NULL,
      UPDATE_TIME     TIMESTAMP(6)  NOT NULL,
      REC_VER         NUMBER(19)  NOT NULL,
      TAG_SEQ			    NUMBER(19)	NOT NULL,
      CONSTRAINT plms_role_permission_PK PRIMARY KEY (ID)
      ENABLE
   );
   
   COMMENT ON TABLE plms_role_permission IS '角色权限表'; 
   COMMENT ON COLUMN plms_role_permission.id IS '表id'; 
   COMMENT ON COLUMN plms_role_permission.ROLE_ID IS '角色id'; 
   COMMENT ON COLUMN plms_role_permission.PERMISSION_ID IS '权限id'; 
   COMMENT ON COLUMN plms_role_permission.IS_ACTIVE IS '状态';
   COMMENT ON COLUMN plms_role_permission.CREATED_BY IS '新增人';
   COMMENT ON COLUMN plms_role_permission.CREATE_TIME IS '新增日期';
   COMMENT ON COLUMN plms_role_permission.UPDATED_BY IS '修改人';
   COMMENT ON COLUMN plms_role_permission.UPDATE_TIME IS '修改日期';
   COMMENT ON COLUMN plms_role_permission.REC_VER IS 'Version';
   COMMENT ON COLUMN plms_role_permission.TAG_SEQ IS 'Tag';
   
   CREATE SEQUENCE seq_plms_role_permission MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER NOCYCLE;
   
--****************************************************
--
--用户角色表
--创建人: linj
--创建日期: 2016-06-01
--目标版本: 1.0
--****************************************************  
   CREATE TABLE plms_user_role
   (  ID              NUMBER(19)  NOT NULL,
      USER_ID         VARCHAR2(50),  
      ROLE_ID         NUMBER(19),  
      IS_ACTIVE       CHAR(1)  NOT NULL,
      CREATED_BY      VARCHAR2(50)  NOT NULL,
      CREATE_TIME     TIMESTAMP(6)  NOT NULL,
      UPDATED_BY      VARCHAR2(50)  NOT NULL,
      UPDATE_TIME     TIMESTAMP(6)  NOT NULL,
      REC_VER         NUMBER(19)  NOT NULL,
      TAG_SEQ			    NUMBER(19)	NOT NULL,
      CONSTRAINT plms_user_role_PK PRIMARY KEY (ID)
      ENABLE
   );
   
   COMMENT ON TABLE plms_user_role IS '用户角色表'; 
   COMMENT ON COLUMN plms_user_role.id IS '表id'; 
   COMMENT ON COLUMN plms_user_role.USER_ID IS '用户id'; 
   COMMENT ON COLUMN plms_user_role.ROLE_ID IS '角色id'; 
   COMMENT ON COLUMN plms_user_role.IS_ACTIVE IS '状态';
   COMMENT ON COLUMN plms_user_role.CREATED_BY IS '新增人';
   COMMENT ON COLUMN plms_user_role.CREATE_TIME IS '新增日期';
   COMMENT ON COLUMN plms_user_role.UPDATED_BY IS '修改人';
   COMMENT ON COLUMN plms_user_role.UPDATE_TIME IS '修改日期';
   COMMENT ON COLUMN plms_user_role.REC_VER IS 'Version';
   COMMENT ON COLUMN plms_user_role.TAG_SEQ IS 'Tag';
   
   CREATE SEQUENCE seq_plms_user_role MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER NOCYCLE;