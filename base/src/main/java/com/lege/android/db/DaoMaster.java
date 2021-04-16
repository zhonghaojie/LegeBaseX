package com.lege.android.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.identityscope.IdentityScopeType;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/**
 * Master of DAO (schema version 28): knows all DAOs.
 */
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 28;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(Database db, boolean ifNotExists) {
        AlarmUserDao.createTable(db, ifNotExists);
        ArticleHistoryBeanDao.createTable(db, ifNotExists);
        AudioRecordUserDao.createTable(db, ifNotExists);
        CollectionUserDao.createTable(db, ifNotExists);
        EmailMessageUserDao.createTable(db, ifNotExists);
        EmailUserDao.createTable(db, ifNotExists);
        GlobalClockUserDao.createTable(db, ifNotExists);
        MessageUserDao.createTable(db, ifNotExists);
        MissedCallRecordUserDao.createTable(db, ifNotExists);
        NewRemindUserDao.createTable(db, ifNotExists);
        NewsUserDao.createTable(db, ifNotExists);
        NoticeUserDao.createTable(db, ifNotExists);
        PlanUserDao.createTable(db, ifNotExists);
        RecentlyPlayedUserDao.createTable(db, ifNotExists);
        ReminderUserDao.createTable(db, ifNotExists);
        ScheduleUserDao.createTable(db, ifNotExists);
        TaskBeanDao.createTable(db, ifNotExists);
        TipsHistoryBeanDao.createTable(db, ifNotExists);
        UserDao.createTable(db, ifNotExists);
        WallpaperUserDao.createTable(db, ifNotExists);
        WeatherUserDao.createTable(db, ifNotExists);
    }

    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(Database db, boolean ifExists) {
        AlarmUserDao.dropTable(db, ifExists);
        ArticleHistoryBeanDao.dropTable(db, ifExists);
        AudioRecordUserDao.dropTable(db, ifExists);
        CollectionUserDao.dropTable(db, ifExists);
        EmailMessageUserDao.dropTable(db, ifExists);
        EmailUserDao.dropTable(db, ifExists);
        GlobalClockUserDao.dropTable(db, ifExists);
        MessageUserDao.dropTable(db, ifExists);
        MissedCallRecordUserDao.dropTable(db, ifExists);
        NewRemindUserDao.dropTable(db, ifExists);
        NewsUserDao.dropTable(db, ifExists);
        NoticeUserDao.dropTable(db, ifExists);
        PlanUserDao.dropTable(db, ifExists);
        RecentlyPlayedUserDao.dropTable(db, ifExists);
        ReminderUserDao.dropTable(db, ifExists);
        ScheduleUserDao.dropTable(db, ifExists);
        TaskBeanDao.dropTable(db, ifExists);
        TipsHistoryBeanDao.dropTable(db, ifExists);
        UserDao.dropTable(db, ifExists);
        WallpaperUserDao.dropTable(db, ifExists);
        WeatherUserDao.dropTable(db, ifExists);
    }

    /**
     * WARNING: Drops all table on Upgrade! Use only during development.
     * Convenience method using a {@link DevOpenHelper}.
     */
    public static DaoSession newDevSession(Context context, String name) {
        Database db = new DevOpenHelper(context, name).getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        return daoMaster.newSession();
    }

    public DaoMaster(SQLiteDatabase db) {
        this(new StandardDatabase(db));
    }

    public DaoMaster(Database db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(AlarmUserDao.class);
        registerDaoClass(ArticleHistoryBeanDao.class);
        registerDaoClass(AudioRecordUserDao.class);
        registerDaoClass(CollectionUserDao.class);
        registerDaoClass(EmailMessageUserDao.class);
        registerDaoClass(EmailUserDao.class);
        registerDaoClass(GlobalClockUserDao.class);
        registerDaoClass(MessageUserDao.class);
        registerDaoClass(MissedCallRecordUserDao.class);
        registerDaoClass(NewRemindUserDao.class);
        registerDaoClass(NewsUserDao.class);
        registerDaoClass(NoticeUserDao.class);
        registerDaoClass(PlanUserDao.class);
        registerDaoClass(RecentlyPlayedUserDao.class);
        registerDaoClass(ReminderUserDao.class);
        registerDaoClass(ScheduleUserDao.class);
        registerDaoClass(TaskBeanDao.class);
        registerDaoClass(TipsHistoryBeanDao.class);
        registerDaoClass(UserDao.class);
        registerDaoClass(WallpaperUserDao.class);
        registerDaoClass(WeatherUserDao.class);
    }

    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }

    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }

    /**
     * Calls {@link #createAllTables(Database, boolean)} in {@link #onCreate(Database)} -
     */
    public static abstract class OpenHelper extends DatabaseOpenHelper {
        public OpenHelper(Context context, String name) {
            super(context, name, SCHEMA_VERSION);
        }

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(Database db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }

    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name) {
            super(context, name);
        }

        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

}
