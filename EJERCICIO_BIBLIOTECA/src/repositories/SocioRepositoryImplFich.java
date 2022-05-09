package repositories;

import java.util.List;

import modelo.Libro;
import modelo.Socio;
import modelo.response.SocioResponse;

public class SocioRepositoryImplFich implements SocioRepository {

	@Override
	public Socio findSocioByID(Long idSocio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long idSocio) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comprobarLimitePrestamos(Long idSocio) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean prestarLibro(Socio socio, Libro libro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Socio> listarSociosVencidos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNombreSocioMasActivo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SocioResponse> buscarSociosMasActivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void darAlta(String text, String text2) {
		// TODO Auto-generated method stub
		
	}

	
}
