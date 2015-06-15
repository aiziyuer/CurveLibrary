require 'java'
include com.aiziyuer.webapp.scripting.IRubyTester

class RubyTester

  def sayHello

    info = 'Hello World'
    puts "#{info} 1"

    info
  end

end

RubyTester.new