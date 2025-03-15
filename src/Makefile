.PHONY: main clean FORCE

main: poster.pdf

poster.pdf: FORCE
	latexmk -pdflatex='lualatex -interaction nonstopmode' -pdf poster.tex

clean:
	latexmk -pdf -C
	rm poster.nav poster.snm
