package com.findbugs.examples;

public class ScaryRankBugs {
	private String checkStrValue = null;

	public ScaryRankBugs() {
		this.checkStrValue = "SomeValue";
	}

	@SuppressWarnings("unused")
	private void executeSomeConditions() {
		if ("SomeValue".equals(this.checkStrValue)) {
			// Condition 1
		}
	}

	private static void incorrectAssignmentInIfCondition() {
		boolean value = false;
		if (value = true) {
			// do Something
		} else {
			// else Do Something
		}
	}
}
