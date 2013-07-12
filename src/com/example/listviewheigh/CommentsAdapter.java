package com.example.listviewheigh;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CommentsAdapter extends ArrayAdapter<CommentsViewData> {
	Context context;
	CommentsViewData comment;
	List<CommentsViewData> comments;
	private String currentUser = "";

	public CommentsAdapter(Context context, int resource,
			List<CommentsViewData> items) {
		super(context, resource, items);
		this.context = context;
		this.comments = items;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View v = convertView;

		if (v == null) {
			LayoutInflater vi;
			vi = LayoutInflater.from(getContext());
			v = vi.inflate(R.layout.commentsdetailslayout, null);
		}

		comment = comments.get(position);// items.get(position);

		if (comment != null) {
			TextView CommentTextView = (TextView) v
					.findViewById(R.id.txtCommentText);
			TextView commenterView = (TextView) v
					.findViewById(R.id.txtCommenterName);

			if (CommentTextView != null) {
				CommentTextView.setText(comment.getData());
			}
			if (commenterView != null) {
				commenterView.setText(comment.getName());
			}

		}
		return v;

	}
}

class Helper {
	public static void getListViewSize(ListView myListView, Context context) {
		ListAdapter myListAdapter = myListView.getAdapter();
		if (myListAdapter == null) {
			// do nothing return null
			return;
		}
		// set listAdapter in loop for getting final size
		int totalHeight = 0;
		Log.d("numberofrow", "" + myListAdapter.getCount());
		for (int size = 0; size < myListAdapter.getCount(); size++) {

			View listItem = myListAdapter.getView(size, null, myListView);
			if (listItem instanceof ViewGroup)
				listItem.setLayoutParams(new RelativeLayout.LayoutParams(
						RelativeLayout.LayoutParams.WRAP_CONTENT,
						RelativeLayout.LayoutParams.WRAP_CONTENT));
	/*		listItem.measure(
					MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED),
					MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));*/

			WindowManager wm = (WindowManager) context
					.getSystemService(Context.WINDOW_SERVICE);
			Display display = wm.getDefaultDisplay();
			int screenWidth = display.getWidth(); // deprecated
			int height = display.getHeight(); // deprecated

			int listViewWidth = screenWidth - 10 - 10;
			int widthSpec = MeasureSpec.makeMeasureSpec(listViewWidth,
					MeasureSpec.AT_MOST);
			listItem.measure(widthSpec, 0);

			totalHeight += listItem.getMeasuredHeight();
		}
		// setting listview item in adapter
		ViewGroup.LayoutParams params = myListView.getLayoutParams();
		params.height = totalHeight
				+ (myListView.getDividerHeight() * (myListAdapter.getCount() - 1));
		myListView.setLayoutParams(params);
		myListView.requestLayout();
		// print height of adapter on log
		Log.i("height of listItem:", String.valueOf(totalHeight));
	}
}