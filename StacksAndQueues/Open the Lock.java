class Solution {
public int openLock(String[] deadends, String target) {
	Set<String> deadendSet = new HashSet<>(Arrays.asList(deadends));
	String start = "0000";
	if (deadendSet.contains(start)) {
		return -1;
	}
	if (target.equals(start)) {
		return 0;
	}
	Map<Character, List<Character>> map = new HashMap<>();
	Queue<String> queue = new LinkedList<>();
	Set<String> processed = new HashSet<>();
	queue.offer(start);
	queue.offer(null);
	processed.add(start);
	initialize(map);
	int steps = 0;
	while (!queue.isEmpty()) {
		String polledCombination = queue.poll();
		if (polledCombination != null) {
			StringBuilder stringBuilder = new StringBuilder(polledCombination);
			for (int currentIndex = 0; currentIndex < polledCombination.length(); currentIndex++) {
				char currentChar = polledCombination.charAt(currentIndex);
				for (Character nextChar : map.get(currentChar)) {
					stringBuilder.setCharAt(currentIndex, nextChar);
					String newCombination = stringBuilder.toString();
					if (!processed.contains(newCombination) && !deadendSet.contains(newCombination)) {
						if (newCombination.equals(target)) {
							return steps + 1;
						}
						queue.offer(newCombination);
					}
					stringBuilder.setCharAt(currentIndex, currentChar);
					processed.add(newCombination);
				}
			}
		} else {
			if (!queue.isEmpty()) {
				queue.offer(null);
				steps++;
			}
		}
	}
	return -1;
}

public void initialize(Map<Character, List<Character>> characterMap) {
	char[] charArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	for (int i = 0; i < charArray.length; i++) {
		characterMap.putIfAbsent(charArray[i], new ArrayList<>());
		characterMap.get(charArray[i]).add(charArray[((i + 1) + 10) % 10]);
		characterMap.get(charArray[i]).add(charArray[((i - 1) + 10) % 10]);
	}
}
}