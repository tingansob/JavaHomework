" BASIC SETUP:

set nocompatible
syntax enable
filetype plugin indent on
set encoding=utf8
set guifont=DroidSansMono\ Nerd\ Font\ 11
set history=500

" inoremap <Space><Space> <Esc>/<++><Enter>"_c4l

" Start VUNDLE Configuration
filetype off	" required

" set the runtime path to include Vundle and initialize
set rtp+=~/.vim/bundle/Vundle.vim
call vundle#begin()

" let vundle manage vundle, required
Plugin 'Vundlevim/Vundle.vim'

" Optional Plugins
Plugin 'scrooloose/nerdtree'

" Get rid of objects in C projects
let NERDTreeIgnore=['\~$', '.o$', 'bower_components', 'node_modules', '__pycache__']
let NERDTreeWinSize=20



Plugin 'scrooloose/syntastic'
Plugin 'ryanoasis/vim-webdevicons'
Plugin 'tpope/vim-surround'
Plugin 'tpope/vim-commentary'
Plugin 'tpope/vim-repeat'
Plugin 'vim-airline/vim-airline'
Plugin 'vim-airline/vim-airline-themes'
Plugin 'tpope/vim-liquid'
Plugin 'tpope/vim-markdown'
let g:markdown_fenced_languages = ['html', 'python', 'ruby', 'yaml', 'haml', 'bash=sh']
Plugin 'tpope/vim-fugitive'
Plugin 'tpope/vim-git'
Plugin 'tpope/vim-rails'
Plugin 'tpope/vim-vinegar'
Plugin 'tpope/vim-haml'
Plugin 'tpope/vim-eunuch'
Plugin 'flazz/vim-colorschemes'
Plugin 'suan/vim-instant-markdown'
Plugin 'xuyuanp/nerdtree-git-plugin'
Plugin 'junegunn/vim-emoji'
Plugin 'junegunn/vim-github-dashboard'
Plugin 'reedes/vim-pencil'
Plugin 'loremipsum'
Plugin 'vimwiki/vimwiki'
Plugin 'freitass/todo.txt-vim'
" Plugin 'valloric/youcompleteme'
Plugin 'jiangmiao/auto-pairs'
Plugin 'mattn/emmet-vim'




let g:markdown_syntax_conceal = 0
" All plugins must be added before the following line
call vundle#end()			"required
filetype plugin indent on	"required


""""""""""""""""""
" CONFIGURATION: "
""""""""""""""""""
set nu
set ruler

" Set Proper Tabs
set tabstop=4
set softtabstop=4
set shiftwidth=4
set smarttab
set autoindent
set laststatus=2

" Enable the use of the mouse
set mouse=a

" FINDING FILES:
" Search down into subfolders
" Provides tab-completion for all file-related tasks
set path+=**

" Display all matching files when we tab complete
set wildmenu

set showcmd
set hlsearch
set incsearch
set ignorecase
set smartcase
set si
set backspace=indent,eol,start
set confirm
set visualbell
set cmdheight=2
set wrap

set matchpairs+=<:>
set ttyfast
set showmode
set showcmd

set magic
set hid
set showmatch

set foldcolumn=4
set expandtab



augroup AutoSaveFolds
    autocmd!
    autocmd BufWinLeave ?* mkview
    autocmd BufWinEnter ?* silent loadview
augroup END

nnoremap <silent> <Space> @=(foldlevel('.')?'za':"\<Space>")<CR>
vnoremap <Space> zf

" Ignore compiled files
set wildignore=*.o,*~,*.pyc
if has("win16") || has("win32")
    set wildignore+=.git\*,.hg\*,.svn\*
else
    set wildignore+=*/.git/*,*/.hg/*,*/.svn/*,*/.DS_Store
endif


" Syntastic Configuration
set statusline+=%#warningmsg#
set statusline+=%{SyntasticStatuslineFlag()}
set statusline+=%*

let g:syntastic_always_populate_loc_list = 1
let g:syntastic_auto_loc_list = 1
let g:syntastic_check_on_open = 1
let g:syntastic_check_on_wq = 0
function Py2()
    let g:syntastic_python_python_exec = '/usr/loca/bin/python2.7'
endfunction

function Py3()
    let g:syntastic_python_python_exec = '/usr/local/bin/python3.5'
endfunction
call Py3()

autocmd! FileType c,cpp,java,php call CSyntaxAfter()
" END Syntastic Config

let g:markdown_fenced_languages = ['html', 'python', 'bash=sh']
let g:markdown_syntax_conceal = 0

" Keymaps
"
map <C-n> :NERDTreeToggle<CR>
map <C-r> :set rnu!<CR>
" map <C-m> :setlocal spell! spelllang=en_us<CR>
" set spellcheck option
set spellfile=$HOME/Dropbox/vim/spell/en.utf-8.add

set t_Co=256
colorscheme gentooish " material  Dev_Delight


" Brief help
" :PluginList       - lists configured plugins
" :PluginInstall    - installs plugins; append `!` to update or just :PluginUpdate
" :PluginSearch foo - searches for foo; append `!` to refresh local cache
" :PluginClean      - confirms removal of unused plugins; append `!` to auto-approve removal
"
" see :h vundle for more details or wiki for FAQ
" Put your non-Plugin stuff after this line


