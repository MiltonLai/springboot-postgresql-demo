package com.rockbb.pgdemo.commons.api.dto;

import java.math.BigDecimal;
import java.util.Date;

/*
CREATE TABLE "public"."test_account" (
	"id" bigserial primary key,
	"name" varchar(64),
	"val" int4 NOT NULL DEFAULT 0,
	"amount" numeric(20,2) NOT NULL CHECK (amount > 0),
	"flag" bool NOT NULL DEFAULT false,
	"status" int2 NOT NULL DEFAULT 0,
	"created_at" timestamp(6) NOT NULL,
	"updated_at" timestamp(6),
	"version" int8 NOT NULL DEFAULT 0
);

CREATE INDEX ON "public"."test_account" ("name");
CREATE INDEX ON "public"."test_account" ("flag");
CREATE INDEX ON "public"."test_account" ("created_at");

COMMENT ON COLUMN "public"."test_account"."id" IS 'ID';
COMMENT ON COLUMN "public"."test_account"."name" IS 'Account Name';
COMMENT ON COLUMN "public"."test_account"."val" IS 'Value';
COMMENT ON COLUMN "public"."test_account"."amount" IS 'Amount';
COMMENT ON COLUMN "public"."test_account"."flag" IS 'Boolean Flag';
COMMENT ON COLUMN "public"."test_account"."status" IS 'Status';
COMMENT ON COLUMN "public"."test_account"."created_at" IS 'Create Time';
COMMENT ON COLUMN "public"."test_account"."updated_at" IS 'Update Time';
COMMENT ON COLUMN "public"."test_account"."version" IS 'Version';
*/
public class AccountDTO {
    private long id;
    private String name;
    private int val;
    private BigDecimal amount;
    private boolean flag;
    private int status;
    private Date createdAt;
    private Date updatedAt;
    private long version;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
