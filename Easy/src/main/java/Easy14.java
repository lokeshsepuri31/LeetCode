public class Easy14 {
	public String longestCommonPrefix(String[] strs) {
		int j = 0;
		boolean flag = true;
		do {
			j++;
			for (int i = 0; i < strs.length; i++) {
				if (strs[i].length() != 0) {
					if (!(j <= strs[i].length() && strs[i].startsWith(strs[0].substring(0, j)))) {
						j--;
						flag = false;
						break;
					}
				} else {
					j--;
					flag = false;
					break;
				}
			}
		} while (j > 0 && flag);

		if (j > 0) {
			return strs[0].substring(0, j);
		} else {
			return "";
		}
	}

	public static void main(String[] args) {
		Easy14 easy14 = new Easy14();
		String[] strs = { "flower", "flow", "flight" };
		System.out.println(easy14.longestCommonPrefix(strs));
	}
}
