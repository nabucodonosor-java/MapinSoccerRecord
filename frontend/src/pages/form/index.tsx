import { Link } from 'react-router-dom';
import './styles.css';

const Form = () => {

    const record = {
        id: 1,
        img: "https://personal-bucket-franco.s3.sa-east-1.amazonaws.com/recorde-futebol.jpg",
        title: "Maior Torcida do Mundo",
        count: 2,
        score: 5.0,
        teamName: "Clube de Regatas Flamengo",
        description: "Segundo último levantamento o flamengo conta com 42 milhões de torcedores"
    };

  return (
    <div className="soccer-form-container  base-card">
        <img className="soccer-card-image" src={record.img} alt={record.title} />
        <div className="soccer-card-bottom-container">
            <h3>{record.title}</h3>
            <form className="soccer-form">
            <div className="form-group soccer-form-group">
                    <label htmlFor="email">Informe seu Email</label>
                    <input type="email" className="form-control" id="email" />
                </div>
                <div className="form-group soccer-form-group">
                    <label htmlFor="score">Informe sua avaliação</label>
                    <select className="form-control" id="score">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                    </select>
                </div>
                <div className="soccer-form-btn-container">
                    <button type="submit" className="btn soccer-btn">Salvar</button>
                    
                </div>
            </form>
            <Link to="/">
             <button className="btn soccer-btn mt-3">Cancelar</button>
            </Link>
          
        </div>
    </div>
  )
}

export default Form;