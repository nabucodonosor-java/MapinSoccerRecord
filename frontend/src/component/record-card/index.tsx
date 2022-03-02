import RecordScore from 'component/record-score';
import { Link } from 'react-router-dom';
import './styles.css';

const RecordCard = () => {

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
    <div>
        <img className='soccer-card-image' src={record.img} alt={record.title} />
        <div className='soccer-card-bottom-container'>
            <h3>{record.title}</h3>
            <h5>{record.teamName}</h5>
            <p>{record.description}</p>
            <RecordScore />
            <Link to={`/form/${record.id}`}>
                <div className='btn soccer-btn'>
                    Avaliar
                </div>
            </Link>
        </div>
    </div>
  )
}

export default RecordCard;