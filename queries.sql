CREATE DATABASE "etemb-futsal"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

CREATE TABLE IF NOT EXISTS public.tb_analise_atletas
(
    id bigint NOT NULL,
    altura_atleta double precision NOT NULL,
    apelido_atleta character varying(100) COLLATE pg_catalog."default" NOT NULL,
    dt_nascimento_atleta timestamp without time zone NOT NULL,
    nome_atleta character varying(150) COLLATE pg_catalog."default" NOT NULL,
    pais_nascimento_atleta character varying(255) COLLATE pg_catalog."default" NOT NULL,
    perna_atleta character varying(20) COLLATE pg_catalog."default" NOT NULL,
    peso_atleta double precision NOT NULL,
    posicao_atleta character varying(30) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT tb_analise_atletas_pkey PRIMARY KEY (id)
)

CREATE TABLE IF NOT EXISTS public.tb_dados_individuais_partida
(
    id bigint NOT NULL,
    assistencias bigint NOT NULL,
    cartoes_amarelo bigint NOT NULL,
    cartoes_vermelho bigint NOT NULL,
    chances_reais_criadas bigint NOT NULL,
    chances_reais_perdidas bigint NOT NULL,
    faltas_cometidas bigint NOT NULL,
    gols_feitos bigint NOT NULL,
    min_jogados double precision NOT NULL,
    nm_atleta character varying(50) COLLATE pg_catalog."default",
    nm_adversario character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT tb_dados_individuais_partida_pkey PRIMARY KEY (id)
)

CREATE TABLE IF NOT EXISTS public.tb_dados_partida
(
    id bigint NOT NULL,
    finalizacoes bigint NOT NULL,
    fk_atleta bigint NOT NULL,
    passes_certos bigint NOT NULL,
    CONSTRAINT tb_dados_partida_pkey PRIMARY KEY (id)
)


CREATE TABLE IF NOT EXISTS public.tb_historico_partidas
(
    id bigint NOT NULL,
    data_partida timestamp without time zone NOT NULL,
    local_partida character varying(100) COLLATE pg_catalog."default" NOT NULL,
    quantidade_gols_mandante bigint NOT NULL,
    quantidade_gols_visitante bigint NOT NULL,
    time_adversario character varying(150) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT tb_historico_partidas_pkey PRIMARY KEY (id)
)