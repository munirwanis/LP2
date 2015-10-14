import java.util.ArrayList;

class MeuPrograma2 {
	public static void main(String[] args) {
		Garagem minhaGaragem = new Garagem();
		Automovel automovel;

		for (int i = 0; i < 5; i++) {
			automovel = minhaGaragem.obterAutomovel(i);
			System.out.println(automovel.getClass().getName());
			
		}




		ChevetteSL novoCsl;
		ChevetteSL csl;
		Chevette cp;
		Automovel aa;

		ChevetteSL x = new ChevetteSL(88);

		csl = x;
		cp = x;
		aa = x;		
		novoCsl = (ChevetteSL)aa;
	}
}

class Automovel {
	public int ano;
	private boolean ligado;

	public Automovel(int a) {
		ano = a;
		ligado = false;
	}

	// Liga o automovel
	public void Liga() {
		ligado = true;
	}

	// Desliga o automovel
	public void Desliga() {
		ligado = false;
	}
}

class Chevette extends Automovel {
	public Chevette(int a) {
		// Acessando o construtor da classe automovel
		super(a);
	}

	// consertar o Chevette
	public void conserta() {
		Desliga();
	}
}

class ChevetteSL extends Chevette {
	boolean arLigado;

	// instanciar novo ChevetteSL
	public ChevetteSL(int a) {
		// Acessando o construtor da super classe Chevette
		super(a);
	}

	// Ligar ar-condicionado
	public void LigarAr() {
		arLigado = true;
	}

	// Delisgar ar-condicionado
	public void DesligaAr() {
		arLigado = false;
	}
}

class DelRey extends Automovel {
	private String cor;

	// instanciar novo DelRey
	public DelRey(int a, String c) {
		// Acessando o construtor da classe automovel
		super(a);
		cor = c;
	}
}

class Garagem {
	private ArrayList<Automovel> vagas;

	// instanciar nova garagem
	// public Garagem() {
	// 	vagas[0] = new Automovel(76);
	// 	vagas[1] = new Chevette(88);
	// 	vagas[2] = new Chevette(93);
	// 	vagas[3] = new ChevetteSL(88);
	// 	vagas[4] = new DelRey(88, "Branco");
	// }

	public Garagem() {
		vagas = new ArrayList<Automovel>();
		vagas.add(new Automovel(76));
		vagas.add(new Chevette(88));
		vagas.add(new Chevette(93));
		vagas.add(new ChevetteSL(88));
		vagas.add(new DelRey(88, "Branco"));
	}

	public Automovel obterAutomovel(int posicao) {
		return vagas.get(posicao);
	}
}

// instanceof herda de duas classes, shit cocô de java xD (pesquisar sobre essa porra)
// ele compara uma referência com uma classe (é bool)

// public static void main(String[] args) {
// 	ChevetteSL novoCsl;
// 	ChevetteSL csl;
// 	Chevette cp;
// 	Automovel aa;
// 	novoCsl = (ChevetteSL) aa;

// 	ChevetteSL x = new ChevetteSL(88);

// 	csl = x;
// 	cp = x;
// 	aa = x;
// }