package com.fly.ui.dialog;

import java.util.Arrays;

import android.app.Dialog;
import android.content.Context;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fly.R;
import com.fly.ui.view.WheelView;
import com.fly.ui.view.WheelView.OnWheelViewListener;

public class CitySelectDialog {

	

	private String[] sf = new String[] { "������	", "�����", "�ӱ�ʡ", "ɽ��ʡ", "����",
			"����ʡ", "����ʡ", "������ʡ", "�Ϻ���", "����ʡ", "�㽭ʡ", "����ʡ", "����ʡ", "����ʡ",
			"ɽ��ʡ", "����ʡ", "����ʡ", "����ʡ", "�㶫ʡ", "����", "����ʡ", "������", "�Ĵ�ʡ",
			"����ʡ", "����ʡ", "����ʡ", "����ʡ", "�ຣʡ", "����", "�½�" };
	private String[][] city = new String[][] {
			{ "������" },
			{ "�����" },
			{ "ʯ��ׯ��", "��ɽ��", "�ػʵ���", "������", "��̨��", "������", "�żҿ���", "�е���", "������",
					"�ȷ���", "��ˮ��", "������", "޻����", "������", "������", "¹Ȫ��", "����",
					"������", "Ǩ����", "�䰲��", "�Ϲ���", "ɳ����", "������", "������", "������",
					"�߱�����", "��ͷ��", "������", "������", "�Ӽ���", "������", "������", "������",
					"������" },
			{ "̫ԭ��", "��ͬ��", "��Ȫ��", "������", "������", "˷����", "�Ž���", "º����", "��ƽ��",
					"������", "ԭƽ��", "Т����", "��ʯ��", "������", "�ܴ���", "������", "�ٷ���",
					"������", "������", "�˳���", "������", "�ӽ���" },
			{ "���ͺ�����", "��ͷ��", "�ں���", "�����", "ͨ����", "���ֹ�����", "��������", "��������",
					"��������", "����ʯ��", "������", "���������", "����������", "����������", "���ֺ�����",
					"������", "������", "��ʤ��", "�ٺ���" },
			{ "������", "������", "��ɽ��", "��˳��", "��Ϫ��", "������", "������", "Ӫ����", "������",
					"������", "�̽���", "������", "������", "��«����", "������", "�߷�����", "��������",
					"ׯ����", "������", "������", "�����", "�躣��", "������", "������", "��ʯ����",
					"������", "������", "��ԭ��", "��Ʊ��", "��Դ��", "�˳���" },
			{ "������", "������", "��ƽ��", "��Դ��", "ͨ����", "��ɽ��", "��ԭ��", "�׳���", "��̨��",
					"������", "�»���", "�Ժ���", "�����", "������", "��ʯ��", "��������", "˫����",
					"÷�ӿ���", "������", "�ٽ���", "�����", "����", "�Ӽ���", "ͼ����", "�ػ���",
					"������", "������", "������" },
			{ "��������", "���������", "������", "�׸���", "˫Ѽɽ��", "������", "������", "��ľ˹��",
					"��̨����", "ĵ������", "�ں���", "������", "˫����", "��־��", "�峣��", "ګ����",
					"������", "��ɽ��", "������", "ͬ����", "������", "��Һ���", "������", "������",
					"������", "������", "���������", "�绯��", "������", "�ض���", "������" },
			{ "�Ϻ���" },
			{ "�Ͼ���", "������", "������", "������", "������", "��ͨ��", "���Ƹ���", "������", "�γ���",
					"������", "����", "̩����", "��Ǩ��", "������", "������", "��ɽ��", "������",
					"������", "������", "��̳��", "�����", "������", "�żҸ���", "��ɽ��", "�⽭��",
					"̫����", "������", "������", "�����", "ͨ����", "������", "������", "��̨��",
					"�����", "������", "������", "������", "������", "������", "������", "�˻���",
					"������", "̩����", "������" },
			{ "������", "������", "������", "������", "������", "������", "����", "������", "��ɽ��",
					"̨����", "��ɽ��", "������", "������", "�ຼ��", "�ٰ���", "��Ҧ��", "��Ϫ��",
					"���", "����", "������", "������", "ƽ����", "ͩ����", "������", "������",
					"������", "��Ϫ��", "������", "������", "������", "��ɽ��", "������", "�ٺ���",
					"��ˮ��", "��Ȫ��" },
			{ "�Ϸ���", "�ߺ���", "������", "������", "����ɽ��", "������", "ͭ����", "������", "��ɽ��",
					"������", "������", "������", "������", "������", "ͩ����", "�쳤��", "������",
					"������", "������", "������", "������", "�����" },

			{ "������", "������", "������", "������", "Ȫ����", "������", "��ƽ��", "������", "������",
					"������", "ʯʨ��", "������", "�ϰ���", "������", "������", "����ɽ��", "�����",
					"������", "��ƽ��", "������", "������", "������", "������" },

			{ "�ϲ���", "��������", "Ƽ����", "�Ž���", "������", "ӥ̶��", "������", "��ƽ��", "�����",
					"��Ϫ��", "�����", "�Ͽ���", "�˴���", "�����", "������", "�߰���", "������",
					"������", "������", "����ɽ��", "�ٴ���" },
			{ "������", "�ൺ��", "�Ͳ���", "��ׯ��", "��Ӫ��", "��̨��", "Ϋ����", "������", "̩����",
					"������", "������", "������", "������", "������", "�ĳ���", "������", "������",
					"��ī��", "ƽ����", "������", "������", "������", "������", "������", "������",
					"������", "��Զ��", "��ϼ��", "������", "������", "�����", "�ٹ���", "������",
					"������", "������", "������", "������", "�޳���", "��̩��", "�ʳ���", "�ĵ���",
					"�ٳ���", "��ɽ��", "������", "������", "������", "������", "������" },
			{ "֣����", "������", "������", "ƽ��ɽ��", "������", "�ױ���", "������", "������", "�����",
					"������", "�����", "����Ͽ��", "������", "������", "������", "������", "������",
					"������", "��֣��", "�Ƿ���", "��ʦ��", "�����", "������", "������", "������",
					"������", "��Դ��", "������", "������", "������", "������", "������", "�鱦��",
					"������", "������", "�ܿ���", "�����", "פ������" },
			{ "�人��", "��ʯ��", "ʮ����", "�˲���", "�差��", "������", "������", "Т����", "������",
					"�Ƹ���", "������", "��ұ��", "��������", "֦����", "������", "֦����", "�Ϻӿ���",
					"������", "�˳���", "������", "Ӧ����", "��½��", "��ˮ��", "������", "ʯ����",
					"�����", "������", "�����", "��Ѩ��", "�����", "��ʩ��", "������", "������",
					"������", "Ǳ����", "������" },
			{ "��ɳ��", "������", "��̶��", "������", "������", "������", "������", "�żҽ���", "������",
					"������", "������", "������", "¦����", "�����", "������", "������", "��ɽ��",
					"������", "������", "�����", "������", "������", "������", "�佭��", "������",
					"�齭��", "��ˮ����", "��Դ��", "������" },
			{ "������", "�ع���", "������", "�麣��", "��ͷ��", "��ɽ��", "������", "տ����", "ï����",
					"������", "������", "÷����", "��β��", "��Դ��", "������", "��Զ��", "��ݸ��",
					"��ɽ��", "������", "������", "�Ƹ���", "��خ��", "������", "������", "�ӻ���",
					"�ֲ���", "������", "������", "�κ���", "˳����", "�Ϻ���", "��ˮ��", "������",
					"̨ɽ��", "�»���", "��ƽ��", "��ɽ��", "��ƽ��", "������", "������", "�⴨��",
					"������", "������", "������", "��Ҫ��", "�Ļ���", "������", "������", "½����",
					"������", "Ӣ����", "������", "������", "�޶���" },
			{ "������", "������", "������", "������", "������", "���Ǹ���", "������", "�����", "������",
					"�Ϫ��", "������", "��ƽ��", "������", "ƾ����", "��ɽ��", "������", "��ɫ��",
					"�ӳ���", "������" },
			{ "������", "������", "ͨʲ��", "������", "������", "��ɽ��", "�Ĳ���", "������", "������" },
			{ "������", "������", "�ϴ���", "������", "�ϴ���" },
			{ "�ɶ���", "�Թ���", "��֦����", "������", "������", "������", "��Ԫ��", "������", "�ڽ���",
					"��ɽ��", "�ϳ���", "�˱���", "�㰲��", "������", "��������", "������", "������",
					"������", "�㺺��", "ʲ����", "������", "������", "��üɽ��", "������", "������",
					"��Դ��", "�Ű���", "������", "������", "������", "������" },
			{ "������", "����ˮ��", "������", "������", "��ˮ��", "�ʻ���", "ͭ����", "������", "�Ͻ���",
					"��˳��", "������", "������", "��Ȫ��" },
			{ "������", "������", "��Ϫ��", "������", "������", "��ͨ��", "������", "������", "��Զ��",
					"˼é��", "������", "������", "��ɽ��", "������", "º����" },
			{ "������", "ͭ����", "������", "������", "μ����", "�Ӱ���", "������", "������", "��ƽ��",
					"������", "������", "������", "������" },
			{ "������", "��������", "�����", "������", "��ˮ��", "������", "��Ȫ��", "�ػ���", "��Ҵ��",
					"������", "ƽ����", "������", "������", "������" },
			{ "������", "���ľ��", "�������" },
			{ "������", "ʯ��ɽ��", "������", "��ͭϿ��", "������" },
			{ "��³ľ����", "����������", "��³����", "������", "������", "������", "��Ȫ��", "������",
					"�������", "��������", "��ͼʲ��", "��ʲ��", "������", "������", "������", "������",
					"������", "����̩��" },

	};
	
	
	private Context context;
	private Button cancelBt;
	private Button okBt;

	private TextView title;

	private WheelView sfSelectView;
	private WheelView cySelectView;
	private Display display;

	private Dialog dialog;
	private LinearLayout  wheelViewContainer ;
	public CitySelectDialog(Context context) {
		this.context = context;
		WindowManager windowManager = (WindowManager) context
				.getSystemService(Context.WINDOW_SERVICE);
		display = windowManager.getDefaultDisplay();
	}

	public CitySelectDialog builder() {
		// ��ȡDialog����
		View view = LayoutInflater.from(context).inflate(
				R.layout.area_picker_layout, null);

		// ����Dialog��С����Ϊ��Ļ����
		view.setMinimumWidth(display.getWidth());
		
		wheelViewContainer = (LinearLayout)view.findViewById(R.id.mid_view);
		wheelViewContainer.setMinimumHeight(display.getHeight()/2);

		cancelBt = (Button) view.findViewById(R.id.cancel);
		cancelBt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		});
		sfSelectView = (WheelView) view.findViewById(R.id.sf_select_view);
		sfSelectView.setOffset(0);
		sfSelectView.setItems(Arrays.asList(this.sf));
		sfSelectView.setOnWheelViewListener(new OnWheelViewListener(){
			
			public void onSelected(int selectedIndex, String item) {
				
	        }
		});
		
		cySelectView = (WheelView) view.findViewById(R.id.city_select_view);
//		cySelectView.setOffset(0);
//		sfSelectView.setItems(Arrays.asList(this.city[0]));
//		cySelectView.setOnWheelViewListener(new OnWheelViewListener(){
//			
//			public void onSelected(int selectedIndex, String item) {
//				  
//	        }
//		});
		

		dialog = new Dialog(context, R.style.ActionSheetDialogStyle);
		dialog.setContentView(view);
		Window dialogWindow = dialog.getWindow();
		dialogWindow.setGravity(Gravity.LEFT | Gravity.BOTTOM);
		WindowManager.LayoutParams lp = dialogWindow.getAttributes();
		lp.x = 0;
		lp.y = 0;
		dialogWindow.setAttributes(lp);

		return this;
	}

	public CitySelectDialog setCancelable(boolean cancel) {
		dialog.setCancelable(cancel);
		return this;
	}

	public CitySelectDialog setCanceledOnTouchOutside(boolean cancel) {
		dialog.setCanceledOnTouchOutside(cancel);
		return this;
	}

	public CitySelectDialog setPositiveButton(String text,
			final OnClickListener listener) {
		if ("".equals(text)) {
			okBt.setText("ȷ��");
		} else {
			okBt.setText(text);
		}
		okBt.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (listener != null)
					listener.onClick(v);
				dialog.dismiss();
			}
		});
		return this;
	}

	public CitySelectDialog setNegativeButton(String text,
			final OnClickListener listener) {
		if ("".equals(text)) {
			cancelBt.setText("ȡ��");
		} else {
			cancelBt.setText(text);
		}
		cancelBt.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (listener != null)
					listener.onClick(v);
				dialog.dismiss();
			}
		});
		return this;
	}

	public void show() {
		dialog.show();
	}

}