package com.example.listviewheigh;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ArrayList<CommentsViewData> commentsViewDatas;
	private CommentsAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ListView commentsListView = (ListView) findViewById(R.id.myListView);

		commentsViewDatas = new ArrayList<CommentsViewData>();

			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (1) ", " 1 ",
				"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif with rani" +
					"and I take this shord" +
					"with araweasfasfas" +
					"asdfasfasfasfasf" +
					"asdfasdfasfasfas" +
					"asdfasdfasdfasfasfasfasdfsadasdfa" +
					"sadfasfasdfasfasfasdfdgfghfghfgjfhfgrptkdfhdf (2) ", " 2 ",
					"Toko toko"));		
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (3) ", " 3 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (4) ", " 4 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif with rani" +
					"and I take this shord" +
					"with araweasfasfas" +
					"asdfasfasfasfasf" +
					"asdfasdfasfasfas (5) ", " 5 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (6) ", " 6 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (7) ", " 7 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (8) ", " 8 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (9) ", " 9 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (10) ", " 10 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (11) ", " 11 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (12) ", " 12 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (13) ", " 13 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (14) ", " 14 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (15) ", " 15 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (16) ", " 16 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (17) ", " 17 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (18) ", " 18 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (19) ", " 19 ",
					"Toko toko"));
			commentsViewDatas.add(new CommentsViewData("Hello I am Sharif (20) ", " 20 ",
					"Toko toko"));
					
			
		adapter = new CommentsAdapter(MainActivity.this,
				R.layout.commentsdetailslayout, commentsViewDatas);
		commentsListView
				.setTranscriptMode(ListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
		commentsListView.setAdapter(adapter);
		Helper.getListViewSize(commentsListView, MainActivity.this);
	}
}
