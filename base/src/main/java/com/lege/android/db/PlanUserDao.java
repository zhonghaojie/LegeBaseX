package com.lege.android.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.lege.android.base.db.PlanUser;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PLAN_USER".
*/
public class PlanUserDao extends AbstractDao<PlanUser, Long> {

    public static final String TABLENAME = "PLAN_USER";

    /**
     * Properties of entity PlanUser.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Taskid = new Property(1, int.class, "taskid", false, "TASKID");
        public final static Property Subject = new Property(2, String.class, "subject", false, "SUBJECT");
        public final static Property Duedate = new Property(3, String.class, "duedate", false, "DUEDATE");
        public final static Property Status = new Property(4, int.class, "status", false, "STATUS");
        public final static Property Human_date = new Property(5, String.class, "human_date", false, "HUMAN_DATE");
        public final static Property Device_sn = new Property(6, String.class, "device_sn", false, "DEVICE_SN");
        public final static Property Tag = new Property(7, int.class, "tag", false, "TAG");
        public final static Property Is_delete = new Property(8, int.class, "is_delete", false, "IS_DELETE");
        public final static Property User_id = new Property(9, int.class, "user_id", false, "USER_ID");
        public final static Property Add_time = new Property(10, Long.class, "add_time", false, "ADD_TIME");
    };


    public PlanUserDao(DaoConfig config) {
        super(config);
    }
    
    public PlanUserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PLAN_USER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TASKID\" INTEGER NOT NULL ," + // 1: taskid
                "\"SUBJECT\" TEXT," + // 2: subject
                "\"DUEDATE\" TEXT," + // 3: duedate
                "\"STATUS\" INTEGER NOT NULL ," + // 4: status
                "\"HUMAN_DATE\" TEXT," + // 5: human_date
                "\"DEVICE_SN\" TEXT," + // 6: device_sn
                "\"TAG\" INTEGER NOT NULL ," + // 7: tag
                "\"IS_DELETE\" INTEGER NOT NULL ," + // 8: is_delete
                "\"USER_ID\" INTEGER NOT NULL ," + // 9: user_id
                "\"ADD_TIME\" INTEGER);"); // 10: add_time
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_PLAN_USER_TASKID ON PLAN_USER" +
                " (\"TASKID\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PLAN_USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PlanUser entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getTaskid());
 
        String subject = entity.getSubject();
        if (subject != null) {
            stmt.bindString(3, subject);
        }
 
        String duedate = entity.getDuedate();
        if (duedate != null) {
            stmt.bindString(4, duedate);
        }
        stmt.bindLong(5, entity.getStatus());
 
        String human_date = entity.getHuman_date();
        if (human_date != null) {
            stmt.bindString(6, human_date);
        }
 
        String device_sn = entity.getDevice_sn();
        if (device_sn != null) {
            stmt.bindString(7, device_sn);
        }
        stmt.bindLong(8, entity.getTag());
        stmt.bindLong(9, entity.getIs_delete());
        stmt.bindLong(10, entity.getUser_id());
 
        Long add_time = entity.getAdd_time();
        if (add_time != null) {
            stmt.bindLong(11, add_time);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PlanUser entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getTaskid());
 
        String subject = entity.getSubject();
        if (subject != null) {
            stmt.bindString(3, subject);
        }
 
        String duedate = entity.getDuedate();
        if (duedate != null) {
            stmt.bindString(4, duedate);
        }
        stmt.bindLong(5, entity.getStatus());
 
        String human_date = entity.getHuman_date();
        if (human_date != null) {
            stmt.bindString(6, human_date);
        }
 
        String device_sn = entity.getDevice_sn();
        if (device_sn != null) {
            stmt.bindString(7, device_sn);
        }
        stmt.bindLong(8, entity.getTag());
        stmt.bindLong(9, entity.getIs_delete());
        stmt.bindLong(10, entity.getUser_id());
 
        Long add_time = entity.getAdd_time();
        if (add_time != null) {
            stmt.bindLong(11, add_time);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public PlanUser readEntity(Cursor cursor, int offset) {
        PlanUser entity = new PlanUser( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // taskid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // subject
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // duedate
            cursor.getInt(offset + 4), // status
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // human_date
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // device_sn
            cursor.getInt(offset + 7), // tag
            cursor.getInt(offset + 8), // is_delete
            cursor.getInt(offset + 9), // user_id
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10) // add_time
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PlanUser entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTaskid(cursor.getInt(offset + 1));
        entity.setSubject(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDuedate(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setStatus(cursor.getInt(offset + 4));
        entity.setHuman_date(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDevice_sn(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTag(cursor.getInt(offset + 7));
        entity.setIs_delete(cursor.getInt(offset + 8));
        entity.setUser_id(cursor.getInt(offset + 9));
        entity.setAdd_time(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(PlanUser entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(PlanUser entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
