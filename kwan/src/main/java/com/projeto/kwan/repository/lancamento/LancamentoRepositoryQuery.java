package com.projeto.kwan.repository.lancamento;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.projeto.kwan.dto.LancamentoEstatisticaCategoria;
import com.projeto.kwan.dto.LancamentoEstatisticaDia;
import com.projeto.kwan.dto.LancamentoEstatisticaPessoa;
import com.projeto.kwan.model.Lancamento;
import com.projeto.kwan.repository.filter.LancamentoFilter;
import com.projeto.kwan.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public List<LancamentoEstatisticaPessoa> porPessoa(LocalDate inicio, LocalDate fim);
	public List<LancamentoEstatisticaCategoria> porCategoria(LocalDate mesReferencia);
	public List<LancamentoEstatisticaDia> porDia(LocalDate mesReferencia);

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}
