package com.lege.android.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.lege.android.base.db.AlarmUser;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ALARM_USER".
*/
public class AlarmUserDao extends AbstractDao<AlarmUser, Long> {

    public static final String TABLENAME = "ALARM_USER";

    /**
     * Properties of entity AlarmUser.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Alarmid = new Property(1, int.class, "alarmid", false, "ALARMID");
        public final static Property Time = new Property(2, String.class, "time", false, "TIME");
        public final static Property Repeat = new Property(3, String.class, "repeat", false, "REPEAT");
        public final static Property Ringingid = new Property(4, String.class, "ringingid", false, "RINGINGID");
        public final static Property IsStart = new Property(5, int.class, "isStart", false, "IS_START");
        public final static Property Skip_holiday = new Property(6, int.class, "skip_holiday", false, "SKIP_HOLIDAY");
        public final static Property Startdate = new Property(7, String.class, "startdate", false, "STARTDATE");
        public final static Property Tag = new Property(8, String.class, "tag", false, "TAG");
        public final static Property Type = new Property(9, int.class, "type", false, "TYPE");
    };


    public AlarmUserDao(DaoConfig config) {
        super(config);
    }
    
    public AlarmUserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ALARM_USER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"ALARMID\" INTEGER NOT NULL ," + // 1: alarmid
                "\"TIME\" TEXT," + // 2: time
                "\"REPEAT\" TEXT," + // 3: repeat
                "\"RINGINGID\" TEXT," + // 4: ringingid
                "\"IS_START\" INTEGER NOT NULL ," + // 5: isStart
                "\"SKIP_HOLIDAY\" INTEGER NOT NULL ," + // 6: skip_holiday
                "\"STARTDATE\" TEXT," + // 7: startdate
                "\"TAG\" TEXT," + // 8: tag
                "\"TYPE\" INTEGER NOT NULL );"); // 9: type
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ALARM_USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, AlarmUser entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getAlarmid());
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(3, time);
        }
 
        String repeat = entity.getRepeat();
        if (repeat != null) {
            stmt.bindString(4, repeat);
        }
 
        String ringingid = entity.getRingingid();
        if (ringingid != null) {
            stmt.bindString(5, ringingid);
        }
        stmt.bindLong(6, entity.getIsStart());
        stmt.bindLong(7, entity.getSkip_holiday());
 
        String startdate = entity.getStartdate();
        if (startdate != null) {
            stmt.bindString(8, startdate);
        }
 
        String tag = entity.getTag();
        if (tag != null) {
            stmt.bindString(9, tag);
        }
        stmt.bindLong(10, entity.getType());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, AlarmUser entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getAlarmid());
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(3, time);
        }
 
        String repeat = entity.getRepeat();
        if (repeat != null) {
            stmt.bindString(4, repeat);
        }
 
        String ringingid = entity.getRingingid();
        if (ringingid != null) {
            stmt.bindString(5, ringingid);
        }
        stmt.bindLong(6, entity.getIsStart());
        stmt.bindLong(7, entity.getSkip_holiday());
 
        String startdate = entity.getStartdate();
        if (startdate != null) {
            stmt.bindString(8, startdate);
        }
 
        String tag = entity.getTag();
        if (tag != null) {
            stmt.bindString(9, tag);
        }
        stmt.bindLong(10, entity.getType());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public AlarmUser readEntity(Cursor cursor, int offset) {
        AlarmUser entity = new AlarmUser( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // alarmid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // time
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // repeat
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // ringingid
            cursor.getInt(offset + 5), // isStart
            cursor.getInt(offset + 6), // skip_holiday
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // startdate
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // tag
            cursor.getInt(offset + 9) // type
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, AlarmUser entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAlarmid(cursor.getInt(offset + 1));
        entity.setTime(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setRepeat(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setRingingid(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setIsStart(cursor.getInt(offset + 5));
        entity.setSkip_holiday(cursor.getInt(offset + 6));
        entity.setStartdate(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setTag(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setType(cursor.getInt(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(AlarmUser entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(AlarmUser entity) {
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
