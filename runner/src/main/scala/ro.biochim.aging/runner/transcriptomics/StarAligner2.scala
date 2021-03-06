package ro.biochim.aging.runner.transcriptomics

import java.io.{File => JFile}

import better.files._
import comp.bio.aging.cromwell.client._
import ro.biochim.aging.runner.core.BasicRunner
import ro.biochim.aging.runner.transcriptomics.DeNovoAnnotations.run

object StarAligner2 extends BasicRunner(
  "/home/antonkulaga/rna-seq/workflows",
  "de-novo/star","star_aligner2.wdl"){

  //run("2/kidney_star_ours.json")
  run("2/liver_star_ours.json")


}
