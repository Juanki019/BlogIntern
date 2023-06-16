import React from "react";
import Hero from "../heroe/Hero";

const Home = ({movies}) => {

    return(
        <div>
            <Hero movies={movies}></Hero>
        </div>
    )

}

export default Home;