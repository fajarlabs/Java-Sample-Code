package java8.features.basic;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class NashornBasic {

	/*
	 * Jalankan file ini dengan cara, Klik kanan -> Run As -> Java Application
	 */
	public static void main(String args[]) {

		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

		String name = "Mahesh";
		Integer result = null;

		try {
			nashorn.eval("print('cetak " + name + "')");
			result = (Integer) nashorn.eval("10 + 2");

		} catch (ScriptException e) {
			System.out.println("Error executing script: " + e.getMessage());
		}

		System.out.println(result.toString());
	}
}
