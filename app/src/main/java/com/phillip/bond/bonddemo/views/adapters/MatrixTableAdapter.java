package com.phillip.bond.bonddemo.views.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.phillip.bond.bonddemo.R;
import com.inqbarna.tablefixheaders.adapters.BaseTableAdapter;

public class MatrixTableAdapter<T> extends BaseTableAdapter {

	public interface onClickListener{
		public void onClickHeader();
		public void onClickRow();
	}

	final static int HEADER_ROW = 0;
	final static int EVEN_ROW = 1;
	final static int ODD_ROW = 2;

	private final static int WIDTH_DIP = 110;
	private final static int HEIGHT_DIP = 32;

	private final Context context;

	private T[][] table;

	private final int width;
	private final int height;
	private  onClickListener mlistener;

	public MatrixTableAdapter(Context context) {
		this(context, null, null);
	}

	public MatrixTableAdapter(Context context, T[][] table, onClickListener listener) {
		this.context = context;
		this.mlistener = listener;
		Resources r = context.getResources();

		width = Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, WIDTH_DIP, r.getDisplayMetrics()));
		height = Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, HEIGHT_DIP, r.getDisplayMetrics()));

		setInformation(table);
	}

	public void setInformation(T[][] table) {
		this.table = table;
	}

	@Override
	public int getRowCount() {
		return table.length - 1;
	}

	@Override
	public int getColumnCount() {
		return table[0].length - 1;
	}

//	@Override
//	public View getView(final int row, final int column, View convertView, ViewGroup parent) {
//		if (convertView == null) {
//			convertView = new TextView(context);
//			((TextView) convertView).setGravity(Gravity.CENTER_VERTICAL);
//		}
//		final String cell =  table[row + 1][column + 1].toString();
//		((TextView) convertView).setText(table[row + 1][column + 1].toString());
//		convertView.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				Toast.makeText(context, "onClick on cell " + cell,Toast.LENGTH_LONG).show();
//			}
//		});
//		return convertView;
//	}

	@Override
	public View getView(int row, int column, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView =  LayoutInflater.from(context).inflate(R.layout.table_item, parent, false);
			holder = new ViewHolder();
			holder.textView = (TextView) convertView.findViewById(R.id.textView);
			holder.background = (RelativeLayout) convertView.findViewById(R.id.background);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		final String cell =  table[row + 1][column + 1].toString();
		final int rowType = getItemViewType(row, column);
		holder.textView.setText(cell);
		switch (rowType) {
			case HEADER_ROW:
				holder.background.setBackgroundColor(context.getResources().getColor(R.color.yellow));
				break;
			case EVEN_ROW:
				holder.background.setBackgroundColor(context.getResources().getColor(R.color.green));
				break;
			case ODD_ROW:
				holder.background.setBackgroundColor(context.getResources().getColor(R.color.blue));
				break;
			default:
				throw new RuntimeException();
		}
		convertView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				switch (rowType) {
					case HEADER_ROW:
						mlistener.onClickHeader();
						break;
					case EVEN_ROW:
						mlistener.onClickRow();
						break;
					case ODD_ROW:
						mlistener.onClickRow();
						break;
					default:
						throw new RuntimeException();
				}
			}
		});


		return convertView;
	}
//
//	public int getLayoutResource(int row, int column) {
//		final int layoutResource;
//		switch (getItemViewType(row, column)) {
//			case 0:
//				layoutResource = R.layout.item_table1_header;
//				break;
//			case 1:
//				layoutResource = R.layout.item_table1;
//				break;
//			default:
//				throw new RuntimeException("wtf?");
//		}
//		return layoutResource;
//	}


	@Override
	public int getHeight(int row) {
		return height;
	}

	@Override
	public int getWidth(int column) {
		return width;
	}

	@Override
	public int getItemViewType(int row, int column) {
		if (row < 0) {
			return HEADER_ROW;
		} else if (row %2 == 0) {
			return EVEN_ROW;
		} else {
			return ODD_ROW;
		}
	}

	@Override
	public int getViewTypeCount() {
		return 3;
	}

	static class ViewHolder{
		TextView textView;
		RelativeLayout background;
	}
}
