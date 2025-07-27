import { useEffect, useState } from "react";
import axios from "axios";

function App() {
  const [pets, setPets] = useState([]);
  const [name, setName] = useState("");
  const [type, setType] = useState("cat");
  const [age, setAge] = useState(1);
  const [status, setStatus] = useState("looking for home");

  useEffect(() => {
    fetchPets();
  }, []);

  const fetchPets = async () => {
    const res = await axios.get("http://localhost:8080/pets");
    setPets(res.data);
  };

  const addPet = async () => {
    await axios.post("http://localhost:8080/pets", { name, type, age, status });
    fetchPets();
  };

  return (
    <div style={{ padding: "20px" }}>
      <h1>Pet Manager</h1>
      <div>
        <input placeholder="Name" value={name} onChange={(e) => setName(e.target.value)} />
        <select value={type} onChange={(e) => setType(e.target.value)}>
          <option value="cat">Cat</option>
          <option value="dog">Dog</option>
        </select>
        <input type="number" value={age} onChange={(e) => setAge(Number(e.target.value))} />
        <select value={status} onChange={(e) => setStatus(e.target.value)}>
          <option value="looking for home">Looking for home</option>
          <option value="adopted">Adopted</option>
        </select>
        <button onClick={addPet}>Add Pet</button>
      </div>

      <ul>
        {pets.map((pet) => (
          <li key={pet.id}>
            {pet.name} ({pet.type}) — {pet.age} y/o — {pet.status}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
