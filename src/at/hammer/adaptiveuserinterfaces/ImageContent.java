package at.hammer.adaptiveuserinterfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageContent {
	public static List<ImageItem> ITEMS = new ArrayList<ImageItem>();
	public static Map<String, ImageItem> ITEM_MAP = new HashMap<String, ImageItem>();
	static {
		// Add 3 sample items.
		addItem(new ImageItem("Cat", R.drawable.cat));
		addItem(new ImageItem("Heisenberg", R.drawable.heisenberg));
		addItem(new ImageItem("Landscape", R.drawable.landscape));
	}

	private static void addItem(ImageItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	public static class ImageItem {
		public String id;
		public int imgRes;

		public ImageItem(String id, int imgRes) {
			this.id = id;
			this.imgRes = imgRes;
		}

		public String toString() {
			return id;
		}
	}
}