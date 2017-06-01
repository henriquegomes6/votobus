package com.br.henrique.votobus.Banco;

import com.br.henrique.votobus.TO.BusNome;

import java.util.ArrayList;
import java.util.List;

public class BancoNome {
    public List<BusNome> lst() {
        List<BusNome> lst = new ArrayList<BusNome>();
        lst.add(new BusNome(1, 6305, "Lageado", "Votorantim (Terminal) - Sorocaba(Centro)"));
        lst.add(new BusNome(2, 6307, "Rio Acima/Vila Garcia/Vila Irineu", "Votorantim (Terminal) - Sorocaba(Centro)"));
        lst.add(new BusNome(3, 6308, "Rio Acima/Vila Garcia", "Votorantim(Terminal) - Sorocaba(Centro)"));
        lst.add(new BusNome(4, 6309, "Vila Nova Direto", "Votorantim(Vila Nova) - Sorocaba(Centro)"));
        lst.add(new BusNome(5, 6310, "Pinheiros", "Votorantim(Terminal) - Sorocaba(Centro)"));
        lst.add(new BusNome(6, 6311, "Vila Garcia via Vila Nova", "Votorantim(Vila Nova) - Sorocaba(Centro)"));
        lst.add(new BusNome(7, 6312, "Shopping Iguatemi/Rodoviária", "Votorantim(Terminal) - Sorocaba(Rodoviária)"));
        lst.add(new BusNome(8, 6313, "Shopping Iguatemi/Rodoviária", "Votorantim(Av. Adolpho Massaglia) - Sorocaba(Rodoviária)"));
        lst.add(new BusNome(9, 3101, "Santa Helena", "Terminal"));
        lst.add(new BusNome(10, 3102, "Itapeva", "Terminal via Votocel"));
        lst.add(new BusNome(11, 3103, "São Lucas", "Iguatemi via Jataí"));
        lst.add(new BusNome(12, 3104, "Serrano", "Terminal via Vossoroca"));
        lst.add(new BusNome(13, 3105, "Serrano", "Terminal via Vila Gali"));
        lst.add(new BusNome(14, 3106, "Iguatemi", "Terminal via Jardim Paraíso até Res. Sicília"));
        lst.add(new BusNome(15, 3107, "Iguatemi", "Terminal via Jardim Clarice"));
        lst.add(new BusNome(16, 3108, "Iguatemi", "Terminal via Parque Bela Vista"));
        lst.add(new BusNome(17, 3109, "Jardim Novo Mundo/Jd Tatiana", "Terminal via Jd Clarice/Iguatemi"));
        lst.add(new BusNome(18, 3110, "Green Valley", "Terminal via Av. São João"));
        lst.add(new BusNome(19, 3111, "Vila Nova", "Terminal via Irineu"));
        lst.add(new BusNome(21, 3112, "Vila Garcia", "Terminal via Jardim Archilla"));
        lst.add(new BusNome(22, 3113, "Karafá", "Terminal"));
        lst.add(new BusNome(23, 3115, "Fornazari", "Terminal via Cemitério"));
        lst.add(new BusNome(24, 3116, "Itapeva", "Terminal via Jataí"));
        lst.add(new BusNome(25, 3118, "Pq São João", "Terminal"));
        lst.add(new BusNome(27, 3122, "Jardim Fortaleza", "Terminal via Angelo Vial"));
        lst.add(new BusNome(28, 3123, "Votocel", "Terminal"));
        lst.add(new BusNome(29, 3124, "Jardim Tatiana/Jd Novo Mundo", "Terminal via Pq do Matão/Iguatemi"));
        lst.add(new BusNome(30, 3125, "Alphaville", "Terminal via Iguatemi"));
        lst.add(new BusNome(31, 3126, "Bairro dos Morros", "via Vale do Sol"));
        return lst;
    }
}
