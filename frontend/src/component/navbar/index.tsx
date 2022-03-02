import MapinLogo from 'assets/img/logo-soccer-records.png';
import './styles.css';

const Navbar = () => {
  return (
    <header>
        <nav className="container">
            <div className="nav-content">
                <div>
                    <h1>MapinSoccer</h1>
                    <p>Conheça e avalie todos os Recordes do Futebol</p>
                </div>
                <a href="https://mapin-webpage.netlify.app/">
                    <img src={MapinLogo} alt="Sem conexão com a internet!" />
                </a>
            </div>
        </nav>
    </header>
  )
}

export default Navbar;