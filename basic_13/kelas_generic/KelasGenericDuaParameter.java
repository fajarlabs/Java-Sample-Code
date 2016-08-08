package basic_13.kelas_generic;

class GenericDuaParameter<T,U> {
	T data_1;
	U data_2;
	
	public T getData_1() {
		return data_1;
	}
	public void setData_1(T data_1) {
		this.data_1 = data_1;
	}
	public U getData_2() {
		return data_2;
	}
	public void setData_2(U data_2) {
		this.data_2 = data_2;
	}
}

public class KelasGenericDuaParameter {
	
	public void cetakHasil() {
		GenericDuaParameter<String,Integer> genericDuaParameter = new GenericDuaParameter<>();
		genericDuaParameter.setData_1("ERROR ");
		genericDuaParameter.setData_2(404);
		
		// Hasilnya cetak "ERROR 404"
		System.out.println(genericDuaParameter.getData_1()+genericDuaParameter.getData_2());
	}
}
