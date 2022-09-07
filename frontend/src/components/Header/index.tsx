import './styles.css';
import logo from "../../assets/img/logo.svg";


function Header() {
    return(
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="dsmeta"/>
                <h1>DSMeta</h1>
                <p>
                    Desenvolvido por 
                    <a href='#'>@devsuperior</a>
                </p>
            </div>
        </header>
    )
}

export default Header;