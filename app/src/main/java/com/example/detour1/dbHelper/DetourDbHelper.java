package com.example.detour1.dbHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.detour1.dbHelper.DetourContract.*;
import com.example.detour1.models.Question;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DetourDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "DetourApp.db";
    public static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public DetourDbHelper(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);

    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        this.db = db;

        final  String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionTable();

    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);

    }

    private void fillQuestionTable() {
        Question q1 = new Question("What are the types of linkages?","Internal and External","External, Internal and None","Internal",2);
        addQuestion(q1);

        Question q2 = new Question("How would you round off a value from 1.66 to 2.0?","ceil(1.66)","floor(1.66)","roundup(1.66)",1);
        addQuestion(q2);


        Question q3 = new Question("Which of the following function sets first n characters of a string to a given character?","strinit()","strnset()","strset()",2);
        addQuestion(q3);

        Question q4 = new Question("If the two strings are identical, then strcmp() function returns","-1","1","Yes",3);
        addQuestion(q4);

        Question q5 = new Question("How will you print \\n on the screen?","printf(\"\\n\");","echo \"\\\\n\";","printf(\"\\\\n\");",3);
        addQuestion(q5);

        Question q6 = new Question("The library function used to find the last occurrence of a character in a string is?","strnstr()","laststr()","strrchr()",3);
        addQuestion(q6);

        Question q7 = new Question("Which of the following function is used to find the first occurrence of a given string in another string?","strchr()","strstr()","strnset()",3);
        addQuestion(q7);
    }

    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuestionsTable.TABLE_NAME,null,cv);
    }
    ArrayList<Question>getAllQuestions(){
        ArrayList<Question> questionList =  new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME,null);
        if (c.moveToFirst()){
            do {

                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            }while (c.moveToNext());
        }
        c.close();
        return questionList;
    }

}
