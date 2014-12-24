package com.fly.ui.activity;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.fly.R;

public class GuideActivity extends BaseActivity {

	private ViewPager guideViewPager;

	private ViewPagerAdapter guideViewAdapter;

	private ArrayList<View> mViews;

	private final int images[] = { R.drawable.guide1_02, R.drawable.guide2_02,
			R.drawable.guide3_02 };

	private ImageView[] guideDots;

	private int currentIndex;

	private ImageButton startBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		SharedPreferences sharepref = getPreferences(Context.MODE_PRIVATE);
		boolean  firstRun  = sharepref.getBoolean("first_run", true);
		if(firstRun == true )
		{
			setContentView(R.layout.gude_activity_layout);
	       
			initView();
	
			initDot();
			Editor edit =  sharepref.edit();
			edit.putBoolean("first_run", false);
			edit.commit();
		}else
		{
			ImageView view = new  ImageView(this);
			Options ops = new Options();
			view.setBackgroundResource(R.drawable.guide4_02);
			setContentView(view, new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
			view.postDelayed(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Intent intent = new Intent(GuideActivity.this,
							MainActivity.class);
					startActivity(intent);
					GuideActivity.this.finish();
				}
			}, 2000);
		}
	
	}

	public void  clickView(View v)
	{
		switch(v.getId())
		{
		  case R.id.start_bt:
		  {
			    Intent intent = new Intent(GuideActivity.this,
						MainActivity.class);
				startActivity(intent);
				GuideActivity.this.finish();
		  }
			break;
		}
	}
	
	// ��ʼ��ҳ��
	private void initView() {
		guideViewPager = (ViewPager) findViewById(R.id.guide_view_pager);
		mViews = new ArrayList<View>();

		for (int i = 0; i < images.length; i++) {

			ImageView iv = new ImageView(GuideActivity.this);
			iv.setBackgroundResource(images[i]);

			mViews.add(iv);
		}

		View view = LayoutInflater.from(GuideActivity.this).inflate(
				R.layout.guide4, null);
		mViews.add(view);

		startBtn = (ImageButton) view.findViewById(R.id.start_bt);

		
		guideViewAdapter = new ViewPagerAdapter(mViews);

		guideViewPager.setAdapter(guideViewAdapter);
		
		guideViewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {
				setCurrentDot(arg0);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {

			}
		});

		startBtn.setOnClickListener(this);
	}

	private void initDot() {

		LinearLayout layout = (LinearLayout) findViewById(R.id.guide_dots);

		guideDots = new ImageView[mViews.size()];

		for (int i = 0; i < mViews.size(); i++) {
			guideDots[i] = (ImageView) layout.getChildAt(i);
			guideDots[i].setSelected(false);
		}

		currentIndex = 0;
		guideDots[currentIndex].setSelected(true);
	}

	private void setCurrentDot(int position) {
		if (position < 0 || position > mViews.size() - 1
				|| currentIndex == position) {
			return;
		}

		guideDots[position].setSelected(true);
		guideDots[currentIndex].setSelected(false);

		currentIndex = position;
	}
}
